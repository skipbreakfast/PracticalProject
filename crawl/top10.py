#!/usr/bin/env python
# -*- coding:utf-8 -*-
#@Time  : 2021/3/2 21:35
#@Author: 李明特
#@File  : top10.py

import requests
import re
import time
import lxml.html

# 获取搜索商品网页源码
def getHtml(keyword):
    headers = {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:81.0) Gecko/20100101 Firefox/81.0'
    }
    base_url = 'https://search.jd.com/Search?keyword='+keyword+'&enc=utf-8&wq='+keyword
    html = requests.get(base_url,headers=headers).content.decode(errors='ignore')
    return html

# 构建特定图书网页网址
def getWids(html):
    urlList = []
    wids = re.findall("wids:'(.*?)'",html,re.S)
    wids = wids[0].split(',')
    # print(wids)
    for i in wids:
        url = 'https://item.jd.com/' + i + '.html'
        urlList.append(url)
    return urlList

#获取书籍详细信息
def getInfo(urls):
    headers = {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:81.0) Gecko/20100101 Firefox/81.0'
    }
    resultInfo = []
    for url in urls[:10]:
        html = requests.get(url, headers=headers).content.decode(errors='ignore')
        # 获取书名
        name = re.findall('class="sku-name">(.*?)</div>',html,re.S)[0].replace(' ','').replace('\n','')
        try:
            img ='<img'+ re.findall('<img(.*?)>',name,re.DOTALL)[0] +'>'
            name = name.replace(img, '')
        except IndexError:
            pass

        #获取作者
        selector = lxml.html.fromstring(html)
        try:
            author = selector.xpath('//div[@id="p-author"]/a/@data-name')
            author = '、'.join(author)
        except Exception as e:
            print(e)

        # 获取出版社
        parameter = selector.xpath('//ul[@id="parameter2"]/li[@clstag="shangpin|keycount|product|chubanshe_3"]/@title')[0]
        time.sleep(0.5)
        resultInfo.append((name, author, parameter))
    return resultInfo

#插入数据库



def main():
    book = input("请输入要搜索的图书名称：")
    goodsHtml = getHtml(book)
    html_list = getWids(goodsHtml)
    infoList = getInfo(html_list)




main()
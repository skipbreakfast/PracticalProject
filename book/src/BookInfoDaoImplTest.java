import bean.BookInfo;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: jackyar
 * @Date: 2021/4/24 22:37
 * @Description:
 */
public class BookInfoDaoImplTest {

    @Test
    public void countBookInfo() {
        BookInfoDaoImpl dao = new BookInfoDaoImpl();
        System.out.println(dao.countBookInfo());
    }

    @Test
    public void queryBookDao() {
        BookInfoDaoImpl dao = new BookInfoDaoImpl();
        List<BookInfo> infos = dao.queryBookDao();
        for (BookInfo info : infos){
            System.out.println(info);
        }
    }

    @Test
    public void addBookInfo() {
        BookInfoDaoImpl dao = new BookInfoDaoImpl();
        dao.addBookInfo("xxx","sss","ccc");
    }


    @Test
    public void deleteBookInfoByName() {
        BookInfoDaoImpl dao = new BookInfoDaoImpl();
        dao.deleteBookInfoByName("xxx");
    }

    @Test
    public void updateBookInfoByName() {
        BookInfoDaoImpl dao = new BookInfoDaoImpl();
        dao.updateBookInfoByName("世界", "平凡的世界");
    }

    @Test
    public void pushBook() {
        BookInfoDaoImpl dao = new BookInfoDaoImpl();
        System.out.println(dao.pushBook());
    }
}
/*
 * Created by JFormDesigner on Tue Apr 27 17:00:58 CST 2021
 */

package show;

import java.awt.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class Scan extends JFrame {
    public Scan() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        setTitle("\u56fe\u4e66\u7ba1\u7406");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setBackground(new Color(204, 204, 255));
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("\u56fe\u4e66\u540d\u79f0\uff1a");
            panel1.add(label1);
            label1.setBounds(new Rectangle(new Point(70, 45), label1.getPreferredSize()));
            panel1.add(textField1);
            textField1.setBounds(145, 40, 310, textField1.getPreferredSize().height);

            //---- button1 ----
            button1.setText("\u67e5\u8be2");
            panel1.add(button1);
            button1.setBounds(470, 40, 55, button1.getPreferredSize().height);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(table1);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(70, 80, scrollPane1.getPreferredSize().width, 265);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel1);
        panel1.setBounds(0, 10, 600, 435);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

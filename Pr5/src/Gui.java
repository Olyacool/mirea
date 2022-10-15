package pr5;
import java.awt.*;
import javax.swing.*;

public class Gui {
    public static void main(String args[]) {
        JFrame a = new JFrame("example");
        JButton b = new JButton("click me");
        b.setBounds(90,90,85,85);
       // a.add(b); //добавляем к окну кнопку
        a.setSize(500,500); // размер окна
       // a.setLayout(null); //если убрать то будет сплошная кнопка
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// после нажатия на крестик программа автоматом отключается
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);//установка цвета
        panel.setPreferredSize(new Dimension(3000, 3000)); //предпочитаемые размеры
        panel.add(b);
        a.setContentPane(panel);
        JButton c = new JButton(" Hello world! ");
        c.setBounds(100,100,35,155);
        panel.add(c);

        JPanel subpanel = new JPanel();
        subpanel.setBackground(Color.white);
        subpanel.setPreferredSize(new Dimension(200, 300));
        JPanel subpanel2 = new JPanel();
        subpanel2.setBackground(Color.white);
        subpanel2.setPreferredSize(new Dimension(200, 300));
        panel.add(subpanel);
        panel.add(subpanel2);
        subpanel.add(b);
        subpanel2.add(c);

        ImageIcon icon = new ImageIcon("C:\\Users\\ivc6-10\\Desktop\\me.jpg");

        JLabel label = new JLabel(icon);
        panel.add(label, BorderLayout.CENTER);
        panel.setVisible(true);
    }
}

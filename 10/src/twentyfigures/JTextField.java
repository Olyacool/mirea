package twentyfigures;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JTextField extends JFrame{
    private Circle circle;
    JPanel[] pnl = new JPanel[20];
    public JTextField(){
        setLayout(new GridLayout(5,4));
        for(int i = 0 ; i < pnl.length ; i++){
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(r,g,b));
            add(pnl[i]);
        }
        circle = new Circle(100, 250, 75, 75);
        pnl[4].setLayout(new BorderLayout());
        pnl[4].add(new JButton("one"),BorderLayout.WEST);
        pnl[4].add(new JButton("two"),BorderLayout.EAST);
        pnl[4].add(new JButton("three"),BorderLayout.SOUTH);
        pnl[4].add(new JButton("four"),BorderLayout.NORTH);
        pnl[4].add(new JButton("five"),BorderLayout.CENTER);
        pnl[10].setLayout(new FlowLayout());
        pnl[10].add(new JButton("one"));
        pnl[10].add(new JButton("two"));
        pnl[10].add(new JButton("three"));
        pnl[10].add(new JButton("four"));
        pnl[10].add(new JButton(Circle));
        setSize(800,500);
    }
    public static void main(String[]args){
        new JTextField().setVisible(true);
    }
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(circle);
    }

}

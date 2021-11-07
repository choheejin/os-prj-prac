package TenthWeek.prac9;

import javax.swing.*;
import java.awt.*;

public class Prac08 extends JFrame{
    public Prac08(){
        setTitle("여러개의 패널을 가진 프레임");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();

        JPanel pn1 = new JPanel();
        JPanel pn2 = new JPanel();
        JPanel pn3 = new JPanel();

        pn1.setBackground(Color.LIGHT_GRAY);
        pn3.setBackground(Color.YELLOW);

        c.add(pn1, BorderLayout.NORTH);
        c.add(pn2);
        c.add(pn3, BorderLayout.SOUTH);

        JButton jb1 = new JButton("열기");
        JButton jb2 = new JButton("닫기");
        JButton jb3 = new JButton("나가기");

        pn1.add(jb1);
        pn2.add(jb2);
        pn3.add(jb3);

        JButton jb4 = new JButton("Word Input");
        JTextField text = new JTextField(10);

        pn3.add(jb4);
        pn3.add(text);

        for(int i =0; i<10; i++){
            int x = (int)(Math.random()*200)+50;
            int y = (int)(Math.random()*200)+50;
            JLabel jl = new JLabel("*");
            jl.setLocation(x,y);
            jl.setSize(10,10);
            jl.setForeground(Color.RED);
            jl.setOpaque(true);
            c.add(jl);
        }

        setVisible(true);
        setSize(350, 350);
    }

    public static void main(String[] args) {
        new Prac08();
    }
}

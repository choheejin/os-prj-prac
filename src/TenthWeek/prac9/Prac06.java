package TenthWeek.prac9;

import javax.swing.*;
import java.awt.*;

public class Prac06 extends JFrame{
    public Prac06(){
        setTitle("Random Labels");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        for(int i =0; i< 20; i++){
            int x = (int)(Math.random()*200)+50;
            int y = (int)(Math.random()*200)+50;
            JLabel jl = new JLabel();
            jl.setLocation(x,y);
            jl.setSize(10, 10);
            jl.setOpaque(true);
            jl.setBackground(Color.BLUE);
            c.add(jl);
        }
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Prac06();
    }
}

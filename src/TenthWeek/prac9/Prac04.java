package TenthWeek.prac9;

import javax.swing.*;
import java.awt.*;

public class Prac04 extends JFrame{
    public Prac04(){
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(1, 10));

        Color color[] = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY };

        for(int i =0; i< 10; i++){
            String num = Integer.toString(i);
            JButton jb = (new JButton(num));
            jb.setOpaque(true);
            jb.setBackground(color[i]);
            c.add(jb);
        }
        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Prac04();
    }
}

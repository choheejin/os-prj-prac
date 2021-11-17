package EleventhWeek.prac;

import java.awt.event.*;
import javax.swing.*;

public class Prac06 extends JFrame
{
    JPanel jp = new JPanel();
    JLabel jl = new JLabel("c");
    Prac06() {
        setTitle("클릭 연습 용 응용프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(jp);
        jp.setLayout(null);
        jl.addMouseListener(new clickListener());
        jl.setLocation(100, 100);
        jl.setSize(10, 10);
        jp.add(jl);

        setSize(300, 300);
        setVisible(true);
        jp.requestFocus();
    }

    public class clickListener implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            jl.setLocation((int)(Math.random()*300), (int)(Math.random()*300));
        }

        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}

    }

    public static void main(String[] args) {
        new Prac06();
    }
}
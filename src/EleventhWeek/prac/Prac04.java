package EleventhWeek.prac;

import java.awt.event.*;
import javax.swing.*;


public class Prac04 extends JFrame {
    JPanel jp = new JPanel();
    JLabel jl = new JLabel("Love Java");

    Prac04() {
        this.setTitle("Left키로 문자열 한칸씩 이동");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(jp);
        jp.addKeyListener(new LeftListener());
        jp.add(jl);
        setSize(200, 100);
        setVisible(true);
        jp.requestFocus();
    }

    public static void main(String[] args) {
        new Prac04();
    }

    public class LeftListener extends KeyAdapter {
        String str = jl.getText();
        int c = 0;

        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();

            if(keyCode == KeyEvent.VK_LEFT)
                c++;

            jl.setText(str.substring(c) + str.substring(0, c));

            if(c == str.length())
                c = 0;

        }
    }
}
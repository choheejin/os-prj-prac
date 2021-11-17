package EleventhWeek.prac;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Prac02 extends JFrame {
    JPanel jp = new JPanel();

    Prac02() {
        setTitle("드래깅동안 YELLO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(jp);

        jp.addMouseMotionListener(new motionListener());
        jp.setBackground(Color.green);

        setSize(250,250);
        setVisible(true);
    }

    public class motionListener implements MouseMotionListener {
        public void mouseDragged(MouseEvent e) {
            jp = (JPanel)e.getSource();
            jp.setBackground(Color.yellow);
        }

        public void mouseMoved(MouseEvent e) {
            jp = (JPanel)e.getSource();
            jp.setBackground(Color.GREEN);
        }

    }

    public static void main(String[] args) {
        new Prac02();
    }
}
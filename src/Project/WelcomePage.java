package Project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Welcome extends JFrame implements ActionListener {

    JButton Welcome;

    public Welcome() {

        Container c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        Welcome = new JButton("WELCOME");
        Welcome.setVisible(true);
        Welcome.setBounds(130, 150, 120, 30);
        Welcome.addActionListener(this);
        c.add(Welcome);

    }

    public void actionPerformed(ActionEvent e) {
        try {
            LoginPage l = new LoginPage();
            JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
            currentFrame.dispose();

        } catch (Exception e1) {
            System.out.println(e1);
        }
    }
}

public class WelcomePage {

    public static void main(String[] args) {
        Welcome f = new Welcome();
        f.setVisible(true);
        f.setBounds(100, 50, 400, 400);
        f.setTitle("Welcome Page");
    }
}
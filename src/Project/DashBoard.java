package Project;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DashBoard implements ActionListener {

    JPanel P1, P2;
    JLabel logo, Name, quots, logo1, logo2, logo3, logo4, logo5, logo6, logo7;
    JButton Home, Recharge, Wallet, Add, About, Logout;
    JLabel home;

    public DashBoard() {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setBounds(100, 50, 1200, 700);
        f.setTitle("DashBoard");

        Container c = f.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        P1 = new JPanel();
        P1.setLayout(null);
        P1.setVisible(true);
        P1.setBounds(0, 0, 350, 800);
        P1.setBackground(Color.WHITE);
        c.add(P1);

        P2 = new JPanel();
        P2.setLayout(null);
        P2.setVisible(true);
        P2.setBounds(350, 0, 850, 800);
        P2.setBackground(Color.LIGHT_GRAY);
        c.add(P2);

        ImageIcon originalImgIcon = new ImageIcon("D:/Swapnil_Back_UP/Swapnil_Back_UP/Programming/JAVA/Project/Recharge Management System/src/Project/Images/logo.png");
        Image originalImage = originalImgIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon img = new ImageIcon(scaledImage);
        logo = new JLabel(img);
        logo.setVisible(true);
        logo.setBounds(30, 30, 50, 50);
        P1.add(logo);

        Name = new JLabel("SWAPNIL SYSTEMS");
        Name.setVisible(true);
        Name.setBounds(100, 30, 250, 25);
        Font font1 = new Font("Arial Black", Font.BOLD, 20);
        Name.setFont(font1);
        P1.add(Name);

        quots = new JLabel("  Efficiency Is Everything");
        quots.setVisible(true);
        quots.setBounds(100, 60, 250, 25);
        Font font2 = new Font("Times New Roman", Font.PLAIN, 20);
        quots.setFont(font2);
        P1.add(quots);

        Home = new JButton("Home");
        Home.setVisible(true);
        Home.setBounds(150, 150, 130, 32);
        Home.addActionListener(this);
        P1.add(Home);

        ImageIcon originalImgIcon1 = new ImageIcon("D:/Swapnil_Back_UP/Swapnil_Back_UP/Programming/JAVA/Project/Recharge Management System/src/Project/Images/Home.png");
        Image originalImage1 = originalImgIcon1.getImage();
        Image scaledImage1 = originalImage1.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon img1 = new ImageIcon(scaledImage1);
        logo1 = new JLabel(img1);
        logo1.setVisible(true);
        logo1.setBounds(60, 150, 50, 35);
        P1.add(logo1);

        Recharge = new JButton("Recharge");
        Recharge.setVisible(true);
        Recharge.setBounds(150, 230, 130, 32);
        Recharge.addActionListener(this);
        P1.add(Recharge);

        ImageIcon originalImgIcon2 = new ImageIcon("D:/Swapnil_Back_UP/Swapnil_Back_UP/Programming/JAVA/Project/Recharge Management System/src/Project/Images/Recharge.jpg");
        Image originalImage2 = originalImgIcon2.getImage();
        Image scaledImage2 = originalImage2.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon img2 = new ImageIcon(scaledImage2);
        logo2 = new JLabel(img2);
        logo2.setVisible(true);
        logo2.setBounds(60, 230, 50, 35);
        P1.add(logo2);

        Wallet = new JButton("Wallet Balance");
        Wallet.setVisible(true);
        Wallet.setBounds(150, 310, 130, 32);
        Wallet.addActionListener(this);
        P1.add(Wallet);

        ImageIcon originalImgIcon3 = new ImageIcon("D:/Swapnil_Back_UP/Swapnil_Back_UP/Programming/JAVA/Project/Recharge Management System/src/Project/Images/Wallet.png");
        Image originalImage3 = originalImgIcon3.getImage();
        Image scaledImage3 = originalImage3.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon img3 = new ImageIcon(scaledImage3);
        logo3 = new JLabel(img3);
        logo3.setVisible(true);
        logo3.setBounds(60, 310, 50, 35);
        P1.add(logo3);

        Add = new JButton("Add Money");
        Add.setVisible(true);
        Add.setBounds(150, 390, 130, 32);
        Add.addActionListener(this);
        P1.add(Add);

        ImageIcon originalImgIcon4 = new ImageIcon("D:/Swapnil_Back_UP/Swapnil_Back_UP/Programming/JAVA/Project/Recharge Management System/src/Project/Images/Add.png");
        Image originalImage4 = originalImgIcon4.getImage();
        Image scaledImage4 = originalImage4.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon img4 = new ImageIcon(scaledImage4);
        logo4 = new JLabel(img4);
        logo4.setVisible(true);
        logo4.setBounds(60, 390, 50, 35);
        P1.add(logo4);

        About = new JButton("About");
        About.setVisible(true);
        About.setBounds(150, 470, 130, 32);
        About.addActionListener(this);
        P1.add(About);

        ImageIcon originalImgIcon5 = new ImageIcon("D:/Swapnil_Back_UP/Swapnil_Back_UP/Programming/JAVA/Project/Recharge Management System/src/Project/Images/About.png");
        Image originalImage5 = originalImgIcon5.getImage();
        Image scaledImage5 = originalImage5.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon img5 = new ImageIcon(scaledImage5);
        logo5 = new JLabel(img5);
        logo5.setVisible(true);
        logo5.setBounds(60, 470, 50, 35);
        P1.add(logo5);

        Logout = new JButton("Logout");
        Logout.setVisible(true);
        Logout.setBounds(150, 580, 130, 32);
        Logout.addActionListener(this);
        P1.add(Logout);

        ImageIcon originalImgIcon6 = new ImageIcon("D:/Swapnil_Back_UP/Swapnil_Back_UP/Programming/JAVA/Project/Recharge Management System/src/Project/Images/Logout.jpeg");
        Image originalImage6 = originalImgIcon6.getImage();
        Image scaledImage6 = originalImage6.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon img6 = new ImageIcon(scaledImage6);
        logo6 = new JLabel(img6);
        logo6.setVisible(true);
        logo6.setBounds(60, 580, 50, 35);
        P1.add(logo6);

        ImageIcon originalImgIcon7 = new ImageIcon("D:/Swapnil_Back_UP/Swapnil_Back_UP/Programming/JAVA/Project/Recharge Management System/src/Project/Images/bg.png");
        Image originalImage7 = originalImgIcon7.getImage();
        Image scaledImage7 = originalImage7.getScaledInstance(700, 500, Image.SCALE_SMOOTH);
        ImageIcon img7 = new ImageIcon(scaledImage7);
        logo7 = new JLabel(img7);
        logo7.setVisible(true);
        logo7.setBounds(0, 0, 900, 750);
        P2.add(logo7);

        home = new JLabel("Home");
        home.setVisible(true);
        home.setBounds(50, 50, 150, 35);
        Font font3 = new Font("Arial Black", Font.BOLD, 40);
        home.setFont(font3);
        P2.add(home);

    }

    public void actionPerformed(ActionEvent e) {
        try {

            if (e.getSource()==Home) {
                DashBoard d = new DashBoard();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();  
           }

            if (e.getSource() == Recharge) {
                Recharge r = new Recharge();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();
            }

            if (e.getSource() == Wallet) {
                Wallet w = new Wallet();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();
            }

            if (e.getSource()==Add) {
                AddMoney a = new AddMoney();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();
            }

            if (e.getSource()==About) {
                About ab = new About();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();
            }

            if (e.getSource()==Logout) {
                LoginPage l = new LoginPage();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose(); 
            }

        } catch (Exception e1) {
            System.out.println(e1);
        }
    }

    public static void main(String[] args) {
        new DashBoard();
    }

}

package Project;

import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

public class Recharge implements ActionListener {

    JPanel P1, P2, P3;
    JLabel logo, Name, quots, logo1, logo2, logo3, logo4, logo5, logo6, home, Mo_No, Enter, Se_Pr, Plan, Amount;
    JButton Home, Recharge, Wallet, Add, About, Logout, Submit;
    JTextField Mo_NoTextField, AmountTextField;
    JComboBox Se_PrTextField, PlanTextField;

    public Recharge() {

        JFrame f = new JFrame();
        f.setVisible(true);
        f.setBounds(100, 50, 1200, 700);
        f.setTitle("Recharge");

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

        P3 = new JPanel();
        P3.setLayout(null);
        P3.setVisible(true);
        P3.setBounds(100, 100, 730, 500);
        P3.setBackground(Color.WHITE);
        P2.add(P3);

        ImageIcon originalImgIcon = new ImageIcon(
                "D:/Swapnil_Back_UP/Swapnil_Back_UP/Programming/JAVA/Project/Recharge Management System/src/Project/Images/logo.png");
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

        ImageIcon originalImgIcon1 = new ImageIcon(
                "D:/Swapnil_Back_UP/Swapnil_Back_UP/Programming/JAVA/Project/Recharge Management System/src/Project/Images/Home.png");
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

        ImageIcon originalImgIcon2 = new ImageIcon(
                "D:/Swapnil_Back_UP/Swapnil_Back_UP/Programming/JAVA/Project/Recharge Management System/src/Project/Images/Recharge.jpg");
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

        ImageIcon originalImgIcon3 = new ImageIcon(
                "D:/Swapnil_Back_UP/Swapnil_Back_UP/Programming/JAVA/Project/Recharge Management System/src/Project/Images/Wallet.png");
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

        ImageIcon originalImgIcon4 = new ImageIcon(
                "D:/Swapnil_Back_UP/Swapnil_Back_UP/Programming/JAVA/Project/Recharge Management System/src/Project/Images/Add.png");
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

        ImageIcon originalImgIcon5 = new ImageIcon(
                "D:/Swapnil_Back_UP/Swapnil_Back_UP/Programming/JAVA/Project/Recharge Management System/src/Project/Images/About.png");
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

        ImageIcon originalImgIcon6 = new ImageIcon(
                "D:/Swapnil_Back_UP/Swapnil_Back_UP/Programming/JAVA/Project/Recharge Management System/src/Project/Images/Logout.jpeg");
        Image originalImage6 = originalImgIcon6.getImage();
        Image scaledImage6 = originalImage6.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon img6 = new ImageIcon(scaledImage6);
        logo6 = new JLabel(img6);
        logo6.setVisible(true);
        logo6.setBounds(60, 580, 50, 35);
        P1.add(logo6);

        home = new JLabel("Recharge Here ");
        home.setVisible(true);
        home.setBounds(50, 50, 250, 35);
        Font font3 = new Font("Arial Black", Font.BOLD, 25);
        home.setFont(font3);
        P2.add(home);

        Enter = new JLabel("Enter Details");
        Enter.setVisible(true);
        Enter.setBounds(300, 50, 250, 20);
        Font font4 = new Font("Arial", Font.BOLD, 20);
        Enter.setFont(font4);
        P3.add(Enter);

        Mo_No = new JLabel("Mobile Number");
        Mo_No.setVisible(true);
        Mo_No.setBounds(70, 100, 250, 20);
        Font font5 = new Font("Arial", Font.BOLD, 20);
        Mo_No.setFont(font5);
        P3.add(Mo_No);

        Mo_NoTextField = new JTextField();
        Mo_NoTextField.setVisible(true);
        Mo_NoTextField.setBounds(280, 100, 200, 25);
        Font font6 = new Font("Arial", Font.BOLD, 20);
        Mo_NoTextField.setFont(font6);
        P3.add(Mo_NoTextField);

        Se_Pr = new JLabel("Service Provider");
        Se_Pr.setVisible(true);
        Se_Pr.setBounds(70, 170, 250, 20);
        Font font7 = new Font("Arial", Font.BOLD, 20);
        Se_Pr.setFont(font7);
        P3.add(Se_Pr);

        String Service[] = { "Jio", "Airtel", "Idea", "Vodafone", "BSNL" };
        Se_PrTextField = new JComboBox<>(Service);
        Se_PrTextField.setVisible(true);
        Se_PrTextField.setBounds(280, 170, 200, 25);
        Font font8 = new Font("Arial", Font.BOLD, 17);
        Se_PrTextField.setFont(font8);
        P3.add(Se_PrTextField);

        Plan = new JLabel("Plan");
        Plan.setVisible(true);
        Plan.setBounds(70, 240, 250, 20);
        Font font9 = new Font("Arial", Font.BOLD, 20);
        Plan.setFont(font9);
        P3.add(Plan);

        String Plan[] = { "PrePaid", "PostPaid" };
        PlanTextField = new JComboBox<>(Plan);
        PlanTextField.setVisible(true);
        PlanTextField.setBounds(280, 240, 200, 25);
        Font font10 = new Font("Arial", Font.BOLD, 17);
        PlanTextField.setFont(font10);
        P3.add(PlanTextField);

        Amount = new JLabel("Amount");
        Amount.setVisible(true);
        Amount.setBounds(70, 310, 250, 20);
        Font font11 = new Font("Arial", Font.BOLD, 20);
        Amount.setFont(font11);
        P3.add(Amount);

        AmountTextField = new JTextField();
        AmountTextField.setVisible(true);
        AmountTextField.setBounds(280, 310, 200, 25);
        Font font12 = new Font("Arial", Font.BOLD, 20);
        AmountTextField.setFont(font12);
        P3.add(AmountTextField);

        Submit = new JButton("Recharge");
        Submit.setVisible(true);
        Submit.setBounds(300, 400, 150, 35);
        Font font13 = new Font("Arial", Font.BOLD, 17);
        Submit.setFont(font13);
        Submit.addActionListener(this);
        P3.add(Submit);

    }

    public void actionPerformed(ActionEvent e) {
        try {

            if (e.getSource() == Home) {
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

            if (e.getSource() == Add) {
                AddMoney a = new AddMoney();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();
            }

            if (e.getSource() == About) {
                About ab = new About();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();
            }

            if (e.getSource() == Logout) {
                LoginPage l = new LoginPage();
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                currentFrame.dispose();
            }

            if (e.getSource() == Submit) {

                String Mo_No = Mo_NoTextField.getText();

                Conn c = new Conn();

                String query = "SELECT Amount FROM rechargedata WHERE Mo_No=?";
                PreparedStatement preparedStatement = c.c.prepareStatement(query);
                preparedStatement.setString(1, Mo_No);
                ResultSet rs = preparedStatement.executeQuery();

                if (rs.next()) {
                    int oldAmount = rs.getInt("Amount");
                    int Amount = Integer.parseInt(AmountTextField.getText());
                    int newAmount = oldAmount - Amount;

                    String updateQuery = "UPDATE rechargedata SET Amount=? WHERE Mo_No=?";
                    PreparedStatement updateStatement = c.c.prepareStatement(updateQuery);
                    updateStatement.setInt(1, newAmount);
                    updateStatement.setString(2, Mo_No);
                    updateStatement.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Recharge Succesufll");
                } else {
                    JOptionPane.showMessageDialog(null, "Recharge unSuccesufll");
                }

            }

        } catch (Exception e1) {
            System.out.println(e1);
        }
    }

    public static void main(String[] args) {
        new Recharge();
    }

}

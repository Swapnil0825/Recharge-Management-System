package Project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

public class AddMoney implements ActionListener {

    JPanel P1, P2, P3;
    JLabel logo, Name, quots, logo1, logo2, logo3, logo4, logo5, logo6, home, Mo_No, Enter, Card, CVV, EX_Date,
            Card_Type, Amount;
    JButton Home, Recharge, Wallet, Add, About, Logout, Add_Money;
    JTextField Mo_NoTextField, CardTextField, CVVTextField, AmountTextField;
    JComboBox Date, Month, Year, Type;

    public AddMoney() {

        JFrame f = new JFrame();
        f.setVisible(true);
        f.setBounds(100, 50, 1200, 700);
        f.setTitle("Add Money");

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

        home = new JLabel("Add Money ");
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

        Card = new JLabel("Card Number");
        Card.setVisible(true);
        Card.setBounds(70, 150, 250, 20);
        Font font7 = new Font("Arial", Font.BOLD, 20);
        Card.setFont(font7);
        P3.add(Card);

        CardTextField = new JTextField();
        CardTextField.setVisible(true);
        CardTextField.setBounds(280, 150, 200, 25);
        Font font8 = new Font("Arial", Font.BOLD, 20);
        CardTextField.setFont(font8);
        P3.add(CardTextField);

        CVV = new JLabel("CVV Number");
        CVV.setVisible(true);
        CVV.setBounds(70, 200, 250, 20);
        Font font9 = new Font("Arial", Font.BOLD, 20);
        CVV.setFont(font9);
        P3.add(CVV);

        CVVTextField = new JTextField();
        CVVTextField.setVisible(true);
        CVVTextField.setBounds(280, 200, 200, 25);
        Font font10 = new Font("Arial", Font.BOLD, 20);
        CVVTextField.setFont(font10);
        P3.add(CVVTextField);

        EX_Date = new JLabel("Expiry Date");
        EX_Date.setVisible(true);
        EX_Date.setBounds(70, 250, 250, 20);
        Font font11 = new Font("Arial", Font.BOLD, 20);
        EX_Date.setFont(font11);
        P3.add(EX_Date);

        String Date1[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
                "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        String Month1[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "Octomber", "November", "December" };
        String Year1[] = { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" };

        Date = new JComboBox<>(Date1);
        Date.setVisible(true);
        Date.setBounds(280, 250, 40, 20);
        P3.add(Date);

        Month = new JComboBox<>(Month1);
        Month.setVisible(true);
        Month.setBounds(340, 250, 90, 20);
        P3.add(Month);

        Year = new JComboBox<>(Year1);
        Year.setVisible(true);
        Year.setBounds(450, 250, 90, 20);
        P3.add(Year);

        Card_Type = new JLabel("Card Type");
        Card_Type.setVisible(true);
        Card_Type.setBounds(70, 300, 250, 22);
        Font font12 = new Font("Arial", Font.BOLD, 20);
        Card_Type.setFont(font12);
        P3.add(Card_Type);

        String Type1[] = { "MasterCard", "Platinum", "Rupay" };

        Type = new JComboBox<>(Type1);
        Type.setVisible(true);
        Type.setBounds(280, 300, 200, 20);
        P3.add(Type);

        Amount = new JLabel("Amount");
        Amount.setVisible(true);
        Amount.setBounds(70, 350, 250, 22);
        Font font13 = new Font("Arial", Font.BOLD, 20);
        Amount.setFont(font13);
        P3.add(Amount);

        AmountTextField = new JTextField();
        AmountTextField.setVisible(true);
        AmountTextField.setBounds(280, 350, 200, 25);
        Font font14 = new Font("Arial", Font.BOLD, 20);
        AmountTextField.setFont(font14);
        P3.add(AmountTextField);

        Add_Money = new JButton("ADD MONEY");
        Add_Money.setVisible(true);
        Add_Money.setBounds(270, 430, 200, 35);
        Font font15 = new Font("Arial", Font.BOLD, 17);
        Add_Money.setFont(font15);
        Add_Money.addActionListener(this);
        P3.add(Add_Money);
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

            if (e.getSource() == Add_Money) {
                String Mo_No = Mo_NoTextField.getText();
                String Card = CardTextField.getText();
                String CVV = CVVTextField.getText();
                String EX_Date = Date.getSelectedItem() + " " + Month.getSelectedItem() + " " + Year.getSelectedItem();
                String Card_Type = (String) Type.getSelectedItem();
                String Amount = AmountTextField.getText();

                Conn c = new Conn();

                try {
                    String checkQuery = "SELECT * FROM rechargedata WHERE Mo_No=?";
                    PreparedStatement checkStatement = c.c.prepareStatement(checkQuery);
                    checkStatement.setString(1, Mo_No);
                    ResultSet checkResultSet = checkStatement.executeQuery();

                    if (checkResultSet.next()) {
                        int oldAmount = checkResultSet.getInt("Amount");
                        int newAmount = oldAmount + Integer.parseInt(Amount);

                        String updateQuery = "UPDATE rechargedata SET Amount=? WHERE Mo_No=?";
                        PreparedStatement updateStatement = c.c.prepareStatement(updateQuery);
                        updateStatement.setInt(1, newAmount);
                        updateStatement.setString(2, Mo_No);
                        updateStatement.executeUpdate();
                    } else {
                        String insertQuery = "INSERT INTO rechargedata VALUES (?, ?, ?, ?, ?, ?)";
                        PreparedStatement insertStatement = c.c.prepareStatement(insertQuery);
                        insertStatement.setString(1, Mo_No);
                        insertStatement.setString(2, Card);
                        insertStatement.setString(3, CVV);
                        insertStatement.setString(4, EX_Date);
                        insertStatement.setString(5, Card_Type);
                        insertStatement.setString(6, Amount);
                        insertStatement.executeUpdate();
                    }

                    System.out.println("Successfully Insert/Update");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } finally {
                    try {
                        c.c.close();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }

        } catch (Exception e1) {
            System.out.println(e1);
        }
    }

    public static void main(String[] args) {
        new AddMoney();
    }
}

package Frame;

import Entity.*;
import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MyFrame extends JFrame implements ActionListener {

      private static int count = 0;
      private Container c;
      private ImageIcon[] cf;
      private JLabel Name, Phone, wallpaper, title, underline;
      private JLabel[] image, price;
      private JCheckBox[] burger;
      private JTextField[] burgerQty;
      private JTextArea receiptArea;
      private JTextField Namefield, PhoneField, Totalfield;
      private JButton totalBtn, receiptBtn, resetBtn, exitBtn;
      private String[] burgerItems = { "Regular-Burger", "Cheese-Burger", "BBQ Chicken-Burger", "Buffalo-Chicken-Burger", "Crispy-Fried-Chicken-Burger", "Big-Double-Cheese-Burger",
                  "Fish-Burger", "Grilled-Beef-Burger", "Thai-Peanutbutter-Burger", "Veggie-Burger", "French-Fries", "Lassi", "Strawberry-Oreo-Milkshake",
                  "Mojo", "Mojito", "Cold-Coffee" };
      private int[] Prices = { 140, 150, 170, 200, 220, 270, 250, 300, 350, 200, 120, 100, 200, 60, 150, 120 };

      public MyFrame() {
            setTitle("Burger Shop Management System");
            setSize(1250, 720);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            c = this.getContentPane();
            c.setLayout(null);
            setResizable(false);

            ImageIcon icon = new ImageIcon("Images/Icon.png");
            this.setIconImage(icon.getImage());

            ImageIcon Wall = new ImageIcon("Images/Wallpaper.jpg");
            wallpaper = new JLabel(Wall);
            wallpaper.setBounds(0, 0, 1250, 700);
            wallpaper.setLayout(null);
            c.add(wallpaper);

            title = new JLabel("    Burger Shop ");
            title.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 70));
            title.setForeground(new Color(75, 46, 46));
            title.setBounds(380, 10, 500, 60);
            wallpaper.add(title);

            ImageIcon line = new ImageIcon("Images/Underline.png");
            underline = new JLabel(line);
            underline.setBounds(5, 1, getWidth(), 150);
            wallpaper.add(underline);

            burger = new JCheckBox[burgerItems.length * 2];
            image = new JLabel[burgerItems.length];
            burgerQty = new JTextField[burgerItems.length];
            cf = new ImageIcon[burgerItems.length];
            price = new JLabel[burgerItems.length];

            // 1
            cf[0] = new ImageIcon("Images/Regular-Burger.jpg");
            image[0] = new JLabel(cf[0]);
            image[0].setBounds(20, 90, 110, 100);
            wallpaper.add(image[0]);
            image[0].setLayout(null);

            price[0] = new JLabel(" 140 ");
            price[0].setForeground(Color.WHITE);
            price[0].setBackground(new Color(75, 46, 46));
            price[0].setOpaque(true);
            price[0].setBounds(80, 80, 70, 20);
            image[0].add(price[0]);

            burger[0] = new JCheckBox("Regular");
            burger[0].setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
            burger[0].setBounds(30, 180, 120, 50);
            burger[0].setOpaque(false);
            wallpaper.add(burger[0]);

            burgerQty[0] = new JTextField();
            burgerQty[0].setBounds(140, 130, 40, 20);
            wallpaper.add(burgerQty[0]);

            // 2
            cf[1] = new ImageIcon("Images/Cheese-Burger.jpg");
            image[1] = new JLabel(cf[1]);
            image[1].setBounds(20, 240, 110, 100);
            wallpaper.add(image[1]);
            image[1].setLayout(null);

            price[1] = new JLabel(" 150 ");
            price[1].setForeground(Color.WHITE);
            price[1].setBackground(new Color(75, 46, 46));
            price[1].setOpaque(true);
            price[1].setBounds(80, 80, 70, 20);
            image[1].add(price[1]);

            burger[1] = new JCheckBox("Cheese");
            burger[1].setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
            burger[1].setBounds(30, 340, 120, 50);
            burger[1].setOpaque(false);
            wallpaper.add(burger[1]);

            burgerQty[1] = new JTextField();
            burgerQty[1].setBounds(140, 280, 40, 20);
            wallpaper.add(burgerQty[1]);

            // 3
            cf[2] = new ImageIcon("Images/BBQ Chicken-Burger.jpg");
            image[2] = new JLabel(cf[2]);
            image[2].setBounds(20, 390, 120, 100);
            wallpaper.add(image[2]);
            image[2].setLayout(null);

            price[2] = new JLabel(" 170 ");
            price[2].setForeground(Color.WHITE);
            price[2].setBackground(new Color(75, 46, 46));
            price[2].setOpaque(true);
            price[2].setBounds(80, 80, 30, 20);
            image[2].add(price[2]);

            burger[2] = new JCheckBox("BBQ Chicken");
            burger[2].setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
            burger[2].setBounds(30, 490, 140, 50);
            burger[2].setOpaque(false);
            wallpaper.add(burger[2]);

            burgerQty[2] = new JTextField();
            burgerQty[2].setBounds(140, 420, 40, 20);
            wallpaper.add(burgerQty[2]);

            // 4
            cf[3] = new ImageIcon("Images/Buffalo-Chicken-Burger.jpg");
            image[3] = new JLabel(cf[3]);
            image[3].setBounds(20, 540, 110, 100);
            wallpaper.add(image[3]);
            image[3].setLayout(null);

            price[3] = new JLabel(" 200 ");
            price[3].setForeground(Color.WHITE);
            price[3].setBackground(new Color(75, 46, 46));
            price[3].setOpaque(true);
            price[3].setBounds(80, 80, 70, 20);
            image[3].add(price[3]);

            burger[3] = new JCheckBox("Buff Chicken");
            burger[3].setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
            burger[3].setBounds(30, 630, 120, 50);
            burger[3].setOpaque(false);
            wallpaper.add(burger[3]);

            burgerQty[3] = new JTextField();
            burgerQty[3].setBounds(140, 580, 40, 20);
            wallpaper.add(burgerQty[3]);

            // 5
            cf[4] = new ImageIcon("Images/Crispy-Fried-Chicken-Burger.jpg");
            image[4] = new JLabel(cf[4]);
            image[4].setBounds(250, 90, 110, 100);
            wallpaper.add(image[4]);
            image[4].setLayout(null);

            price[4] = new JLabel(" 220 ");
            price[4].setForeground(Color.WHITE);
            price[4].setBackground(new Color(75, 46, 46));
            price[4].setOpaque(true);
            price[4].setBounds(80, 80, 70, 20);
            image[4].add(price[4]);

            burger[4] = new JCheckBox(" Crispy");
            burger[4].setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
            burger[4].setBounds(250, 180, 120, 50);
            burger[4].setOpaque(false);
            wallpaper.add(burger[4]);

            burgerQty[4] = new JTextField();
            burgerQty[4].setBounds(370, 130, 40, 20);
            wallpaper.add(burgerQty[4]);

            // 6
            cf[5] = new ImageIcon("Images/Big-Double-Cheese-Burger.jpg");
            image[5] = new JLabel(cf[5]);
            image[5].setBounds(250, 240, 110, 100);
            wallpaper.add(image[5]);
            image[5].setLayout(null);

            price[5] = new JLabel(" 270 ");
            price[5].setForeground(Color.WHITE);
            price[5].setBackground(new Color(75, 46, 46));
            price[5].setOpaque(true);
            price[5].setBounds(80, 80, 70, 20);
            image[5].add(price[5]);

            burger[5] = new JCheckBox("Big Cheese");
            burger[5].setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
            burger[5].setBounds(250, 340, 120, 50);
            burger[5].setOpaque(false);
            wallpaper.add(burger[5]);

            burgerQty[5] = new JTextField();
            burgerQty[5].setBounds(370, 280, 40, 20);
            wallpaper.add(burgerQty[5]);

            // 7
            cf[6] = new ImageIcon("Images/Fish-Burger.jpg");
            image[6] = new JLabel(cf[6]);
            image[6].setBounds(250, 390, 110, 100);
            wallpaper.add(image[6]);
            image[6].setLayout(null);

            price[6] = new JLabel(" 250 ");
            price[6].setForeground(Color.WHITE);
            price[6].setBackground(new Color(75, 46, 46));
            price[6].setOpaque(true);
            price[6].setBounds(80, 80, 70, 20);
            image[6].add(price[6]);

            burger[6] = new JCheckBox(" Fish");
            burger[6].setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
            burger[6].setBounds(250, 490, 140, 50); 
            burger[6].setOpaque(false);
            wallpaper.add(burger[6]);

            burgerQty[6] = new JTextField();
            burgerQty[6].setBounds(370, 420, 40, 20); 
            wallpaper.add(burgerQty[6]);

            // 8
            cf[7] = new ImageIcon("Images/Grilled-Beef-Burger.jpg");
            image[7] = new JLabel(cf[7]);
            image[7].setBounds(250, 540, 110, 100);
            wallpaper.add(image[7]);
            image[7].setLayout(null);

            price[7] = new JLabel(" 300 ");
            price[7].setForeground(Color.WHITE);
            price[7].setBackground(new Color(75, 46, 46));
            price[7].setOpaque(true);
            price[7].setBounds(80, 80, 70, 20);
            image[7].add(price[7]);

            burger[7] = new JCheckBox("Grilled Beef");
            burger[7].setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
            burger[7].setBounds(250, 630, 120, 50);
            burger[7].setOpaque(false);
            wallpaper.add(burger[7]);

            burgerQty[7] = new JTextField();
            burgerQty[7].setBounds(370, 580, 40, 20);
            wallpaper.add(burgerQty[7]);

            
            // 9
            cf[8] = new ImageIcon("Images/Thai-Peanutbutter-Burger.jpg");
            image[8] = new JLabel(cf[8]);
            image[8].setBounds(480, 90, 110, 100); 
            wallpaper.add(image[8]);

            burger[8] = new JCheckBox("Peanutbutter");
            burger[8].setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
            burger[8].setBounds(490, 180, 120, 50); 
            burger[8].setOpaque(false);
            wallpaper.add(burger[8]);
            image[8].setLayout(null);

            price[8] = new JLabel(" 350 ");
            price[8].setForeground(Color.WHITE);
            price[8].setBackground(new Color(75, 46, 46));
            price[8].setOpaque(true);
            price[8].setBounds(80, 80, 70, 20);
            image[8].add(price[8]);

            burgerQty[8] = new JTextField();
            burgerQty[8].setBounds(600, 130, 40, 20); 
            wallpaper.add(burgerQty[8]);

            // 10
            cf[9] = new ImageIcon("Images/Veggie-Burger.jpg");
            image[9] = new JLabel(cf[9]);
            image[9].setBounds(480, 240, 110, 100);
            wallpaper.add(image[9]);

            burger[9] = new JCheckBox(" Veggie");
            burger[9].setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
            burger[9].setBounds(490, 340, 120, 50);
            burger[9].setOpaque(false);
            wallpaper.add(burger[9]);
            image[9].setLayout(null);

            price[9] = new JLabel(" 200 ");
            price[9].setForeground(Color.WHITE);
            price[9].setBackground(new Color(75, 46, 46));
            price[9].setOpaque(true);
            price[9].setBounds(80, 80, 70, 20);
            image[9].add(price[9]);

            burgerQty[9] = new JTextField();
            burgerQty[9].setBounds(600, 280, 40, 20);
            wallpaper.add(burgerQty[9]);

            // 11
            cf[10] = new ImageIcon("Images/French-Fries.jpg");
            image[10] = new JLabel(cf[10]);
            image[10].setBounds(480, 390, 120, 100);
            wallpaper.add(image[10]);

            burger[10] = new JCheckBox(" Fries");
            burger[10].setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
            burger[10].setBounds(490, 490, 120, 50);
            burger[10].setOpaque(false);
            wallpaper.add(burger[10]);
            image[10].setLayout(null);

            price[10] = new JLabel(" 120 ");
            price[10].setForeground(Color.WHITE);
            price[10].setBackground(new Color(75, 46, 46));
            price[10].setOpaque(true);
            price[10].setBounds(90, 80, 70, 20);
            image[10].add(price[10]);

            burgerQty[10] = new JTextField();
            burgerQty[10].setBounds(600, 420, 40, 20);
            wallpaper.add(burgerQty[10]);

            // 12
            cf[11] = new ImageIcon("Images/Lassi.jpg");
            image[11] = new JLabel(cf[11]);
            image[11].setBounds(480, 540, 110, 100);
            wallpaper.add(image[11]);

            burger[11] = new JCheckBox(" Lassi");
            burger[11].setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
            burger[11].setBounds(475, 630, 140, 50);
            burger[11].setOpaque(false);
            wallpaper.add(burger[11]);
            image[11].setLayout(null);

            price[11] = new JLabel(" 100 ");
            price[11].setForeground(Color.WHITE);
            price[11].setBackground(new Color(75, 46, 46));
            price[11].setOpaque(true);
            price[11].setBounds(80, 80, 70, 20);
            image[11].add(price[11]);

            burgerQty[11] = new JTextField();
            burgerQty[11].setBounds(600, 580, 40, 20);
            wallpaper.add(burgerQty[11]);

            // 13
            cf[12] = new ImageIcon("Images/Strawberry-Oreo-Milkshake.jpg");
            image[12] = new JLabel(cf[12]);
            image[12].setBounds(710, 90, 110, 100);
            wallpaper.add(image[12]);

            burger[12] = new JCheckBox("Milkshake");
            burger[12].setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
            burger[12].setBounds(720, 180, 120, 50);
            burger[12].setOpaque(false);
            wallpaper.add(burger[12]);
            image[12].setLayout(null);

            price[12] = new JLabel(" 200 ");
            price[12].setForeground(Color.WHITE);
            price[12].setBackground(new Color(75, 46, 46));
            price[12].setOpaque(true);
            price[12].setBounds(80, 80, 70, 20);
            image[12].add(price[12]);

            burgerQty[12] = new JTextField();
            burgerQty[12].setBounds(830, 130, 40, 20);
            wallpaper.add(burgerQty[12]);

            // 14

            cf[13] = new ImageIcon("Images/Mojo.jpg");
            image[13] = new JLabel(cf[13]);
            image[13].setBounds(710, 240, 110, 100);
            wallpaper.add(image[13]);

            burger[13] = new JCheckBox(" Mojo");
            burger[13].setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
            burger[13].setBounds(720, 340, 120, 50);
            burger[13].setOpaque(false);
            wallpaper.add(burger[13]);
            image[13].setLayout(null);

            price[13] = new JLabel(" 60 ");
            price[13].setForeground(Color.WHITE);
            price[13].setBackground(new Color(75, 46, 46));
            price[13].setOpaque(true);
            price[13].setBounds(80, 80, 70, 20);
            image[13].add(price[13]);

            burgerQty[13] = new JTextField();
            burgerQty[13].setBounds(830, 280, 40, 20);
            wallpaper.add(burgerQty[13]);

            // 15
            cf[14] = new ImageIcon("Images/Mojito.jpg");
            image[14] = new JLabel(cf[14]);
            image[14].setBounds(710, 390, 120, 100);
            wallpaper.add(image[14]);

            burger[14] = new JCheckBox(" Mojito");
            burger[14].setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
            burger[14].setBounds(720, 490, 140, 50);
            burger[14].setOpaque(false);
            wallpaper.add(burger[14]);
            image[14].setLayout(null);

            price[14] = new JLabel(" 150 ");
            price[14].setForeground(Color.WHITE);
            price[14].setBackground(new Color(75, 46, 46));
            price[14].setOpaque(true);
            price[14].setBounds(90, 80, 70, 20);
            image[14].add(price[14]);

            burgerQty[14] = new JTextField();
            burgerQty[14].setBounds(830, 420, 40, 20);
            wallpaper.add(burgerQty[14]);

            // 16
            cf[15] = new ImageIcon("Images/Cold-Coffee.jpg");
            image[15] = new JLabel(cf[15]);
            image[15].setBounds(710, 540, 110, 100);
            wallpaper.add(image[15]);

            burger[15] = new JCheckBox("Cold-Coffee");
            burger[15].setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
            burger[15].setBounds(705, 630, 120, 50);
            burger[15].setOpaque(false);
            wallpaper.add(burger[15]);
            image[15].setLayout(null);

            price[15] = new JLabel(" 120 ");
            price[15].setForeground(Color.WHITE);
            price[15].setBackground(new Color(75, 46, 46));
            price[15].setOpaque(true);
            price[15].setBounds(80, 80, 70, 20);
            image[15].add(price[15]);

            burgerQty[15] = new JTextField();
            burgerQty[15].setBounds(830, 580, 40, 20);
            wallpaper.add(burgerQty[15]);

            Name = new JLabel("Name: ");
            Name.setFont(new Font("Serif", Font.BOLD, 17));
            Name.setBounds(930, 80, 150, 40);
            wallpaper.add(Name);

            Namefield = new JTextField();
            Namefield.setBounds(990, 90, 170, 25);
            wallpaper.add(Namefield);

            Phone = new JLabel("Phone: ");
            Phone.setFont(new Font("Serif", Font.BOLD, 17));
            Phone.setBounds(930, 110, 150, 40);
            wallpaper.add(Phone);

            PhoneField = new JTextField();
            PhoneField.setBounds(990, 120, 170, 25);
            wallpaper.add(PhoneField);

            receiptArea = new JTextArea();
            receiptArea.setText("Note: 10% VAT % 5% Service Charge will be added");
            receiptArea.setBounds(920, 170, 280, 350);
            wallpaper.add(receiptArea);

            // totalBtn, receiptBtn, resetBtn, exitBtn;

            totalBtn = new JButton("Total");
            totalBtn.setBounds(930, 538, 100, 30);
            totalBtn.setFont(new Font("Serif", Font.BOLD, 15));
            totalBtn.setForeground(Color.BLACK);
            totalBtn.setBackground(new Color(73, 140, 153));
            wallpaper.add(totalBtn);
            totalBtn.addActionListener(this);

            Totalfield = new JTextField();
            Totalfield.setBounds(1050, 530, 100, 45);
            wallpaper.add(Totalfield);

            receiptBtn = new JButton("Receipt");
            receiptBtn.setBounds(920, 610, 100, 30);
            receiptBtn.setFont(new Font("Serif", Font.BOLD, 15));
            receiptBtn.setForeground(Color.BLACK);
            receiptBtn.setBackground(new Color(73, 140, 153));
            wallpaper.add(receiptBtn);
            receiptBtn.addActionListener(this);

            resetBtn = new JButton("Reset");
            resetBtn.setBounds(1020, 610, 100, 30);
            resetBtn.setFont(new Font("Serif", Font.BOLD, 15));
            resetBtn.setForeground(Color.BLACK);
            resetBtn.setBackground(new Color(73, 140, 153));
            wallpaper.add(resetBtn);
            resetBtn.addActionListener(this);

            exitBtn = new JButton("Exit");
            exitBtn.setBounds(1120, 610, 100, 30);
            exitBtn.setFont(new Font("Serif", Font.BOLD, 15));
            exitBtn.setForeground(Color.BLACK);
            exitBtn.setBackground(new Color(128, 10, 16));
            wallpaper.add(exitBtn);
            exitBtn.addActionListener(this);

      }

      public void actionPerformed(ActionEvent e) {
            if (e.getSource() == exitBtn) {
                  System.exit(0);
            } else if (e.getSource() == resetBtn) {

                  for (int i = 0; i < burgerItems.length; i++) {
                        burger[i].setSelected(false);
                        burgerQty[i].setText("");
                  }
                  Namefield.setText("");
                  PhoneField.setText("");
                  Totalfield.setText("");
                  receiptArea.setText("Note: 10% VAT % 5% Service Charge will be added");
            }
            try {
                  if (e.getSource() == totalBtn) {
                        count++;
                        int total = 0;
                        for (int i = 0; i < burgerItems.length; i++) {
                              if (burger[i].isSelected()) {
                                    total += (Integer.parseInt(burgerQty[i].getText()) * Prices[i]);
                              }
                        }
                        String s1, s2, s3 = "", s4;
                        s1 = Namefield.getText();
                        s2 = PhoneField.getText();
                        for (int i = 0; i < burgerItems.length; i++) {
                              if (burger[i].isSelected()) {
                                    s3 += burgerItems[i] + " x " + burgerQty[i].getText() + "\n";
                              }
                        }
                        s4 = String.valueOf(total + (0.05 * total) + (0.1 * total));
                        receiptArea.setText("========================================================" + "\n" + "Name: "
                                    + s1 + "\n" + "Phone: " + s2 + "\n" + s3
                                    + "VAT        10% \n" + "Service Charge  5%\n"
                                    + "--------------------------------------------------------\n"
                                    + "Total Bill                                      " + s4 + "\n");
                        Totalfield.setText(String.valueOf(count));
                        BurgerShop cShop = new BurgerShop(s1, s2, s3, s4);
                        cShop.insertInfo();
                  }
            } catch (NumberFormatException ex) {
                  JOptionPane.showMessageDialog(this, "Invalid Input,Check Again");
            }
            try {
                  if (e.getSource() == receiptBtn) {

                        receiptArea.setText("");
                        File file = new File("./Data/userdata.txt");
                        if (file.exists()) {
                              FileReader fr = new FileReader(file);
                              BufferedReader br = new BufferedReader(fr);
                              String line;
                              while ((line = br.readLine()) != null) {
                                    receiptArea.append(line + "\n");
                              }
                              br.close();
                        }
                  }
            } catch (IOException ioe) {
                  ioe.printStackTrace();
                  JOptionPane.showMessageDialog(this, "Error!");
            }

      }
}

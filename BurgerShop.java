package Entity;

import Frame.*;
import java.lang.*;
import javax.swing.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BurgerShop {
    private String s1, s2, s3, s4;
    private File file;
    private FileWriter fwriter;

    public BurgerShop() {
    }

    public BurgerShop(String s1, String s2, String s3, String s4) {

        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;

    }

    public void insertInfo() {
        try {
            file = new File("./Data/userdata.txt");
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");
            String timeAndDate = myDateObj.format(myFormatObj);

            fwriter = new FileWriter(file, false);
            fwriter.write("\nDate and Time: " + timeAndDate + "\n");
            fwriter.write("========================================================" + "\n");
            fwriter.write("Name: " + s1 + "\n");
            fwriter.write("Phone: " + s2 + "\n");
            fwriter.write(s3 + "\n");
            fwriter.write("VAT        10% \n" + "Service Charge  5%\n");
            fwriter.write("--------------------------------------------------------" + "\n");

            fwriter.write("Total Bill                                      " + s4 + "\n");
            fwriter.flush();
            fwriter.close();

        } catch (IOException i) {
            i.printStackTrace();
            JOptionPane.showMessageDialog(null, "Can't write file!");
        }
    }
}

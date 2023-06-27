


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;

class LabourGui extends Frame {

        JFrame f=new JFrame("Enter Detail");
        JLabel l1, l2, l3, l4,
                l5, l6, l7, l8,l8a,l8b,
                l9, l10, l12,
                l11;

        JTextField tf1, tf2, tf3,
                tf4, tf5, tf6,
                tf7, tf8;

        JTextArea area2, area1;

        JRadioButton rb1, rb2, 
        rb3, rb4;
        
        JComboBox<String> cb2,cb3;


        
        JButton back;
        
        LabourGui() {
                 rb3 = new JRadioButton("Dark");
                rb3.setBounds(1100, 70, 100, 30);
        
                rb4 = new JRadioButton("Light");
                rb4.setBounds(1200, 70, 100, 30);
        
                ButtonGroup bg2 = new ButtonGroup();
                bg2.add(rb3);
                bg2.add(rb4);

                l8b = new JLabel("Select Theme");
                l8b.setBounds(1100, 40, 100, 30);

        back=new JButton("Back");
        back.setBounds(50, 80, 70, 20);

        l1 = new JLabel("Transport");
        l1.setBounds(550, 100, 250, 20);

        l2 = new JLabel(
                "Name of the Labour:");
        l2.setBounds(50, 150, 250, 20);

        tf1 = new JTextField();
        tf1.setBounds(250, 150, 250, 30);

        l3 = new JLabel(
                "Name of the Father:");
        l3.setBounds(50, 200, 250, 20);

        tf2 = new JTextField();
        tf2.setBounds(250, 200, 250, 30);

        l4 = new JLabel("school id:");
        l4.setBounds(50, 250, 250, 20);

        tf3 = new JTextField();
        tf3.setBounds(250, 250, 250, 30);

        l5 = new JLabel("Email ID:");
        l5.setBounds(50, 300, 250, 20);

        tf4 = new JTextField();
        tf4.setBounds(250, 300, 250, 30);

        l6 = new JLabel("Contact Number:");
        l6.setBounds(50, 350, 250, 20);

        tf5 = new JTextField();
        tf5.setBounds(250, 350, 250, 30);

        l7 = new JLabel("Address:");
        l7.setBounds(50, 400, 250, 20);

        area1 = new JTextArea();
        area1.setBounds(250, 400, 250, 90);

        l9 = new JLabel("Gender:");
        l9.setBounds(50, 500, 250, 20);

        JRadioButton r5
                = new JRadioButton(" Male");
        JRadioButton r6
                = new JRadioButton(" Female");

        r5.setBounds(250, 500, 100, 30);
        r6.setBounds(350, 500, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r5);
        bg.add(r6);

        l10 = new JLabel("Nationality:");
        l10.setBounds(50, 550, 250, 20);

        tf6 = new JTextField();
        tf6.setBounds(250, 550, 250, 30);

        l11 = new JLabel("Degree");
        l11.setBounds(50, 600, 250, 20);
        tf7 = new JTextField();
        tf7.setBounds(250, 600, 250, 30);

        l12 = new JLabel("Working hours");
        l12.setBounds(50, 650, 250, 20);
        tf8 = new JTextField();
        tf8.setBounds(250, 650, 250, 30);

        l8 = new JLabel("Select your city");
        l8.setBounds(550, 220, 250, 20);
        String city[] = {"Attock","Islamabad","Karachi","Lahore","Multan","Peshawar","Quetta","Rawalpindi","Sialkot","Sukkur"};
        cb2 =new JComboBox<>(city);
        cb2.setBounds(550, 250, 90, 20);


        l8a = new JLabel("Select your religion");
        l8a.setBounds(700, 220, 250, 20);
        String religion[] = {"Muslim","Hindu","Sikh","Christian","Other"};
        cb3 =new JComboBox<>(religion);
        cb3.setBounds(700, 250, 90, 20);
        


        rb1 = new JRadioButton("Local");
        rb1.setBounds(550, 150, 100, 30);

        rb2 = new JRadioButton("BUS");
        rb2.setBounds(650, 150, 100, 30);


        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(rb1);
        bg1.add(rb2);



        JButton Receipt
                = new JButton("Generate Receipt");
        Receipt.setBounds(1020, 670, 180, 30);

        area2 = new JTextArea();
        area2.setBounds(550, 340, 650, 300);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(l8a);
        add(l9);
        add(l10);
        add(l11);
        add(l12);
        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);
        add(tf5);
        add(tf6);
        add(tf7);
        add(tf8);
        add(area1);
        add(area2);
        add(rb1);
        add(rb2);
        add(r5);
        add(r6);
        add(cb3);
        add(cb2);
        add(Receipt);
        add(back);
        add(l8b);
        add(rb3);
        add(rb4);

        
        rb3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                        setBackground(Color.black);
                        // dispose();
                }
        });

        rb4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                        setBackground(Color.CYAN);
                        // dispose();
                }
        });

        back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                        new ViewAddStudent();
                        dispose();
                }
        });

        Receipt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {



                String data1=tf1.getText();
                String data2=tf2.getText();
                String data3=tf3.getText();
                String data4=tf4.getText();
                String data5=tf5.getText();
                String data6=tf6.getText();
                String data7=tf7.getText();
                String data8=tf8.getText();
                String data9=area1.getText();
                String data10=(String)cb2.getSelectedItem();
                String data11=(String)cb3.getSelectedItem();
                try{
                        File f1=new File("file.txt");
                        FileWriter f2=new FileWriter("file.txt",true);
                        f2.write(data1+"\n");
                        f2.write(data2+"\n");
                        f2.write(data3+"\n");
                        f2.write(data4+"\n");
                        f2.write(data5+"\n");
                        f2.write(data6+"\n");
                        f2.write(data7+"\n");
                        f2.write(data8+"\n");
                        f2.write(data9+"\n");
                        f2.write(data10+"\n");
                        f2.write(data11+"\n");
                        f2.close();


                }
                catch(Exception e1){
                        System.out.println(e1);
                }



                area2.setText("LABOUR DETAIL\n\n");

                area2.setText(area2.getText()
                        + "Labour Name: "
                        + tf1.getText()
                        + "\n");
                area2.setText(area2.getText()
                        + "Father's Name: "
                        + tf2.getText()
                        + "\n");
                area2.setText(area2.getText()
                        + "School id: "
                        + tf3.getText()
                        + "\n");
                area2.setText(area2.getText()
                        + "Email ID: "
                        + tf4.getText()
                        + "\n");
                area2.setText(area2.getText()
                        + "Contact Number: "
                        + tf5.getText()
                        + "\n");

                JOptionPane.showMessageDialog(
                        area2, "DATA SAVED SUCCESSFULLY");
            };
        });
        addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                        System.exit(0);
                }});
        setSize(1380, 800);
        setLayout(null);
        setVisible(true);
        setBackground(Color.CYAN);

    }

}
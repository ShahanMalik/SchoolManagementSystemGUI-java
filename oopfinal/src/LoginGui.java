
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGui implements ActionListener {
    JFrame f1;
    JButton b1;
    JTextField t1,t2;
    JLabel l1,l2;

    LoginGui() {
        f1=new JFrame("SCHOOL MANAGEMENT SYSTEM ");
        l1=new JLabel(" USERNAME");
        l2=new JLabel(" PASSWORD");
        t1=new JTextField();
        t2=new JTextField();
        b1=new JButton("LOGIN");

        l1.setBounds(40,100,300,30);
        l2.setBounds(40,160,300,30);

        t1.setBounds(150,100,200,39);
        t2.setBounds(150,160,200,39);

        b1.setBounds(250,220,100,30);
        b1.setBackground(Color.orange);

        f1.setSize(400,400);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        f1.getContentPane().setBackground(Color.CYAN);
        f1.add(l1);
        b1.addActionListener(this);

        f1.add(b1);
        f1.add(t1);
        f1.add(t2);
        f1.add(l1);
        f1.add(l2);
        f1.getContentPane().add(b1);
 
    }


    public void actionPerformed(ActionEvent e) {
    if (e.getSource()==b1){
        if(t1.getText().equals("123") && t2.getText().equals("123")){
            JOptionPane.showMessageDialog(f1,"Login Successful");
            f1.dispose();     
            ProgressBarExample example = new ProgressBarExample();
            example.setVisible(true);
            try {
                Thread.sleep(1500);
                example.dispose();
            } 
            catch (InterruptedException e1) {
            }
            new SchoolGui();
        }
        else{
            JOptionPane.showMessageDialog(f1,"Invalid Username or Password");
        }

    }

    }



}



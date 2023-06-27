import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SchoolGui implements ActionListener {
    JFrame f1;
    JButton b1,b2,b3,b4,b5,b6;
    JLabel l1;

    SchoolGui() {
        f1=new JFrame("SCHOOL MANAGEMENT SYSTEM ");
        b1=new JButton(" Student");
        b2=new JButton(" Teacher");
        b3=new JButton(" Labour");
        b4=new JButton(" Office Staff");
        b5=new JButton(" Principal");
        b6=new JButton(" Logout");
        l1=new JLabel("WELCOME TO SCHOOL MANAGEMENT SYSTEM");
        l1.setBounds(50,20,300,30);
        f1.setSize(400,500);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        f1.getContentPane().setBackground(Color.CYAN);
        f1.add(l1);
        b1.setBounds(80,80,200,30);
        b2.setBounds(80,140,200,30);
        b3.setBounds(80,200,200,30);
        b4.setBounds(80,260,200,30);
        b5.setBounds(80,320,200,30);
        b6.setBounds(270,414,80,24);
        b6.setBackground(Color.orange);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);        
        b6.addActionListener(this);

        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);        
        f1.add(b6);

        f1.getContentPane().add(b1);
        f1.getContentPane().add(b2);
        f1.getContentPane().add(b3);
        f1.getContentPane().add(b4);
        f1.getContentPane().add(b5);        
        f1.getContentPane().add(b6);

 
    }
    public void actionPerformed(ActionEvent e) {
    if (e.getSource()==b1){
        new ViewAddStudent();
        f1.dispose();

    }
        if (e.getSource()==b2){
            new ViewAddTeacher();
            f1.dispose();

    }
        if (e.getSource()==b3){
            new ViewAddLabour();
            f1.dispose();
    }
    if (e.getSource()==b4){
        new ViewAddOfficeStaff();
        f1.dispose();
    }
    if (e.getSource()==b5){
        new PrincipalGui();
        f1.dispose();
    }
    if (e.getSource()==b6){
        JOptionPane.showMessageDialog(null,"Logout from this device");
        f1.dispose();
    }    
}
 
}



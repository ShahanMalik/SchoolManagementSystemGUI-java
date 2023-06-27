import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewAddTeacher implements ActionListener {
    JFrame f1;
    JButton b1,b2,b3;
    JLabel l1;

    ViewAddTeacher() {
        f1=new JFrame("TEACHER  ");
        b1=new JButton(" Add teacher");
        b2=new JButton(" View teacher Detail");
        b3=new JButton("Back");
        l1=new JLabel("WELCOME TO SCHOOL MANAGEMENT SYSTEM");
        l1.setBounds(50,20,300,30);
        f1.setSize(400,500);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f1.setLayout(null);
        f1.getContentPane().setBackground(Color.CYAN);
        f1.add(l1);
        b1.setBounds(80,80,200,30);
        b2.setBounds(80,140,200,30);
        b3.setBounds(80, 230, 80, 26);
        b3.setBackground(Color.orange);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.getContentPane().add(b1);
        f1.getContentPane().add(b2);
        f1.getContentPane().add(b3);
 
    }
    public void actionPerformed(ActionEvent e) {
    if (e.getSource()==b1){
        new TeacherGui();
        f1.dispose();
    }
        if (e.getSource()==b2){
            DataBase.createAndShowGUI();
            f1.dispose();
    }
    if (e.getSource()==b3){
        new SchoolGui();
        f1.dispose();
}
    }


}



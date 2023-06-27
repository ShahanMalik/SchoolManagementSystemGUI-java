
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PrincipalGui implements ActionListener{
    JFrame f1;
    JButton b1;
    JLabel l1,l2,l3;
    JTextField t1;
    PrincipalGui(){
        f1=new JFrame("Principal");
        b1=new JButton("Back");
        l1=new JLabel("Principal Name ");
        l2=new JLabel("DR Qasim Jan");
        l3=new JLabel("Add new Principal");
        t1=new JTextField();
        f1.setSize(400,500);
        f1.setVisible(true);
        f1.setLayout(null);
        f1.getContentPane().setBackground(Color.CYAN);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(b1);
        f1.add(t1);
        l1.setBounds(50,100,300,30);
        l2.setBounds(180,100,300,30);
        l3.setBounds(50,160,300,30);
        t1.setBounds(180,160,140,30);
        b1.setBounds(50,240,100,30);
        b1.setBackground(Color.orange);
        t1.addActionListener(this);
        b1.addActionListener(this);
        f1.getContentPane().add(t1);
        f1.getContentPane().add(b1);
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            new SchoolGui();
            f1.dispose();
        }
        if (e.getSource()==t1){
            String name=t1.getText();
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter Name");
            }
            else{
                JOptionPane.showMessageDialog(null,"Principal Added");                
                l2.setText(name);
            }
        }
    }
    

    
}


import java.awt.Label;

import javax.swing.*;    
public class ProgressBarExample extends JFrame{    
  ProgressBarExample(){    
  JProgressBar jb;    
  int i=0;  
  Label l1=new Label("Loading data...");
  l1.setBounds(43, 18, 100, 20);
  add(l1);
jb=new JProgressBar(0,2000);    
jb.setBounds(40,40,160,30);         
jb.setValue(0);    
jb.setStringPainted(true);    
add(jb);    
setSize(250,150);    
setLayout(null);   
setVisible(true);     
while(i<=2000){    
  jb.setValue(i);    
  i=i+20;    
  try{
    Thread.sleep(24);
  }catch(Exception e){}    
}    
}    
    
public static void main(String[] args) {    
    new ProgressBarExample();    
    // m.dispose();
    
}    
}    
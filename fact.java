import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class fact 
{
     public static void main(String[] args)  {
        
    JFrame f=new JFrame("Button Example");  
    JTextField tf=new JTextField();  
    tf.setBounds(50,50, 190,25); 
    
    
    
    JLabel l1=new JLabel();
    JButton b=new JButton("Factorial");  
    b.setBounds(50,110,95,30);  
    
    JButton cf=new JButton("Cube");  
    cf.setBounds(150,110,95,30);  
    
    JLabel l3=new JLabel("RESULT");
    l3.setBounds(50,150,95,30); 

    
    f.add(tf);
  
    f.add(b);
//    f.add(tf3);
f.add(l1);
f.add(l3);
    f.add(cf);


    //add code
    b.addActionListener(new ActionListener()
    {  
    public void actionPerformed(ActionEvent e)
        {  
        String num1=tf.getText();
    int num11=Integer.parseInt(num1);
    
    int factt=1;
    for(int i=1;i<=num11;i++)
    {
        
        factt=i*factt;

    }
    System.out.println(factt);
    l3.setText(Integer.toString(factt));
    
        } 
}); 

cf.addActionListener(new ActionListener()
    {  
    public void actionPerformed(ActionEvent e)
        {  
        String num1=tf.getText();
    int num11=Integer.parseInt(num1);
    
   int cub=num11*num11*num11;
    System.out.println(cub);
    l3.setText(Integer.toString(cub));
    
        } 
}); 



    ///////
    f.setSize(500,500);
    f.setLayout(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    
}}


 

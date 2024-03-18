import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame2 
{
     public static void main(String[] args)  {
        
    JFrame f=new JFrame("Button Example");  
    JTextField tf=new JTextField();  
    tf.setBounds(50,50, 190,25); 
    JTextField tf2=new JTextField();  
    tf2.setBounds(50,80, 190,25); 
    
    
    JLabel l1=new JLabel();
    JButton b=new JButton("Add");  
    b.setBounds(50,110,95,30);  
    
    JButton diff=new JButton("Subtract");  
    diff.setBounds(150,110,95,30);  
    
    JLabel l3=new JLabel("RESULT");
    l3.setBounds(50,150,95,30); 
    ///////////save button
    JButton save=new JButton("Save");  
    save.setBounds(150,150,95,30);  
    f.add(save);
    //
    
    f.add(tf);
    f.add(tf2);
    f.add(b);
//    f.add(tf3);
f.add(l1);
f.add(l3);
    f.add(diff);


    //add code
    b.addActionListener(new ActionListener()
    {  
    public void actionPerformed(ActionEvent e)
        {  
        String num1=tf.getText();
    int num11=Integer.parseInt(num1);
    String num2=tf2.getText();
    int num22=Integer.parseInt(num2);
    int sum=num11+num22;
    System.out.println(sum);
    l3.setText(Integer.toString(sum));
    
        } 
}); 

diff.addActionListener(new ActionListener()
        {  
        public void actionPerformed(ActionEvent e)
            {  
            String num1=tf.getText();
        int num11=Integer.parseInt(num1);
        String num2=tf2.getText();
        int num22=Integer.parseInt(num2);
        int sum=num11-num22;
        System.out.println(sum);
        l3.setText(Integer.toString(sum));
        
            } 
    }); 


    ///////
    f.setSize(500,500);
    f.setLayout(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    
}}



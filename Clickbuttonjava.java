
import javax.swing.;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author Acer
 */
public class Clickbuttonjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        
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
//    f.add(tf3);
    f.add(l3);
    f.add(diff);
    
    b.addActionListener(new ActionListener()
        {  
        public void actionPerformed(ActionEvent e)
            {  
            String num1=tf.getText();
        int num11=Integer.parseInt(num1);
        String num2=tf2.getText();
        int num22=Integer.parseInt(num2);
        final int sum=num11+num22;
        System.out.println(sum);
        l3.setText(Integer.toString(sum));
        
            } 
    }); 
    //////////////FOR SUBTRACTION///////
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
    ////////
    //////////////FOR save///////
    save.addActionListener(new ActionListener()
        {  

        public void actionPerformed(ActionEvent e)
            {  
             //code for save data.
                try{    
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/bca","root","");
        Statement st = con.createStatement();
        String query = "INSERT INTO "
                + "marks(id,java) "
                + "VALUES(100,120)";
        st.execute(query);
        System.out.println("value inserted");
                }
                catch(Exception ex){
                
                
                }
    
                ////////
                
            }  
    });
    ////////////
    f.add(b);
    f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
}
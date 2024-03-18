package JDMS;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.*;

public class JDMS{
    public static void main(String[] args) {
       JFrame f1=new JFrame("Database Conection");
       /////coding//////
       JTextField tf=new JTextField();
       tf.setBounds(50,50,190,25);
        JTextField tf2=new JTextField();
        tf2.setBounds(50,90,190,25);
        
        //button
        JButton b=new JButton("Save");
        b.setBounds(50,130,95,30);
        
        f1.add(tf);
        f1.add(tf2);
        f1.add(b);
        
        ////////////
       f1.setLayout(null);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f1.setSize(600,600);
       f1.setVisible(true);
       
       //click section
       b.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e){
               System.out.println("Database will be connected");
               try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con= DriverManager.getConnection("http://localhost/phpmyadmin/index.php?route=/database/structure&db=bca1st","root","");
                Statement st = con.createStatement();
                String query = "INSERT INTO "
                        + "marks(id,java) "
                        + "VALUES(100,120)";
                st.execute(query);
                System.out.println("value inserted");
                        }
                        catch(Exception ex)
                        {
                        }
           }
       }
       );
    }
    
}
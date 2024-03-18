import javax.swing.*;
public class Form1 {
    
     public static void main(String[] args)
    {
        JFrame f1 = new JFrame();
        f1.setBounds(50,50,100,200);
        f1.setTitle("Login Form");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
        JLabel l1 = new JLabel("First Name");
        l1.setSize(50, 50);
        f1.add(l1);
        JLabel l2 = new JLabel("Last Name");
        l2.setSize(50, 50);
        f1.add(l2);


    }
}

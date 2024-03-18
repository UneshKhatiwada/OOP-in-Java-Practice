import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Neww{
    public static void main(String[] args)
    {
        JFrame f1 = new JFrame();
        f1.setBounds(30, 30, 100, 200);
        //f1.setZise(width, height);
        f1.setTitle("Login Form");
        JLabel f2 = new JLabel("Username");
        f2.setBounds(50 , 50, 50, 50);
        JTextField f3 = new JTextField();
        f3.setBounds(44, 40, 60, 60);
        f1.add(f2);
        f1.add(f3);
        f1.setVisible(true);
    }
}
class A extends Thread
{
    int sum = 0;
    public void run(){
        for(int i = 0; i<10; i++)
        {
            sum = sum+i;
        }
    }
}
public class Interthread1{
    public static void main(String[]args)
    {
        A a1 = new A();
        a1.start();
        System.out.println("Sum:" +a1.sum);
    }
}
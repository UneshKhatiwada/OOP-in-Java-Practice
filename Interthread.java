class A extends Thread
{
    int total;
    public void run()
    {
        synchronized(this)
        {
            for(int i=1; i<10; i++)
            {
                total = total+i;
            }
            this.notify();
        }
    }
}
public class Interthread
{
    public static void main(String[]args) throws InterruptedException
    {
        A a1 = new A();
        a1.start();
        synchronized(a1)
        {
            a1.wait();
            System.out.println("Value="+a1.total);
        }

    }
}
//Lifecycle of thread
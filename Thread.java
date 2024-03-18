//Thread 

class A extends Thread
{
    public void run()
    {
        for (int i=0;i<1000;i++)
            {
                 System.out.println("I="+i);
            }
    }
    public void start() 
    {}
    public void setPriority(String minPriority) {
    }
}
class C extends Thread
{
    public void run()
    {
        for (int k=0;k<1000;k++)
            {
                System.out.println("k="+k);
            }
    }
    public void start() 
    {}
}
class B extends Thread
{
    public void run()
    {
        for (int j=0;j<1000;j++)
        {
            System.out.println("j="+j);
        }
    }
public void start() {
}

}
public class Thread 
{
    private static final String MIN_PRIORITY = null;

    public static void main(String[] args) 
    {
        A a1=new A();
        B b1=new B();
        C c1=new C();
        a1.setPriority(Thread.MIN_PRIORITY);
        a1.start();
        c1.start();
        b1.start();
    }

    public void start() {
    } 
}

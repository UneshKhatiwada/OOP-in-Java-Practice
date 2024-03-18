
public class ExampleClass
{  
    public void run() 
    {  
        System.out.println("Thread has ended");  
    }  
   
    public static void main(String[] args) {  
        ExampleClass e1 = new ExampleClass();  
        Thread t1= new Thread();  
        t1.start();  
        System.out.println("Hi");  
    }  
}  
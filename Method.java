//THis is method overloading.
public class Method 
{

    void mymethod(int a, int b)
    {
        System.out.println("i am form second method");
    }
    

    void mymethod()
    {

        System.out.println("i am form first method");
    }

    void mymethod(int a,int b,int c)
    {

        System.out.println("i am form third method");
    }

    public static void main(String[]args)
    {
        Method m1 = new Method();
        m1.mymethod();
        m1.mymethod(4, 5);
        m1.mymethod(1,1,1);

    }
}

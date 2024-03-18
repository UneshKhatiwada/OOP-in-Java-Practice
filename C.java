public class C 
{
    public static void main(String[] args) 
   {
        int a = 4;
        int b=2;
      try
      { 
        int div;
        div= a/b;
        System.out.println("div "+div); 
        }
        catch(ArithmeticException e)
        {
       System.out.println("Error has occured!!");
        }
        int sum=a+b;
        System.out.println("sum: "+sum);
    }
}
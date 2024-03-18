public class Finally 
{

public static void main(String[] args) {
    int a[]={4,0,1};

    try
    {
        int div=a[0]/a[1];
        System.out.println("div is"+div);
    }

    catch(ArrayIndexOutOfBoundsException ex)
    {
        System.out.println("hello milena ni");

    }
     

    finally
    {

        System.out.println("Ma subarna ho ni");
    }
 }
}

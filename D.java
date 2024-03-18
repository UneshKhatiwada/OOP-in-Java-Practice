import java.util.Scanner;

class Validage extends RuntimeException
{
    Validage(String message)
    {
    super(message);
    }
}

public class D
{

    public static void main(String[]args)
    {
        try (Scanner takeinput = new Scanner(System.in)) 
        {
            int age=takeinput.nextInt();
            {
                if(age>18)
                {
                    System.out.println("You can drive");
                }
   
                else
                {
                    throw new Validage("Age is less than 18");
                }
            } 
            }  
            catch(Validage e) 
            {
                System.out.println("Age must be 18");
            }
        }
}


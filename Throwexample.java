class Validage extends RuntimeException
{
    Validage(String message)
    {
    super(message);
    }
}

public class Throwexample 
{
    public static void main(String[]args)
    {
        int age=12;
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

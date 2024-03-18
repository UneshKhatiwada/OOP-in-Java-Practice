
abstract class Bike
{
    abstract void start();
    abstract void stop();
     void engiene()
     {
        System.out.println("Petrol engiene");
     }
}

class BikeFunction extends Bike
{
    void start()
    {
        System.out.println("Bike started");

    }

    void stop(){
        System.out.println("Apply Break if needed");
    }
}

public class Abstract1 
{
    public static void main(String[] args) 
    {
        BikeFunction B1=new BikeFunction();
        B1.start();
        B1.stop();
        B1.engiene();
    }   
}

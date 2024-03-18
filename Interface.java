
interface Bike
{
    abstract void start();
    abstract void stop();
     abstract void engiene();
     
}

class BikeFunction implements Bike
{
    public void start()
    {
        System.out.println("Bike started");

    }

    public void stop(){
        System.out.println("Apply Break if needed");
    }
    public void engiene()
    {
        System.out.println("Petrol engiene");
     }
}

public class Interface 
{
    public static void main(String[] args) 
    {
        BikeFunction B1=new BikeFunction();
        B1.start();
        B1.stop();
        B1.engiene();
    }   
}

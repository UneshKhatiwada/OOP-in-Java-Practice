
 class bookticket
{
    int totalnoofseat=10;
    void book1(int seats)
    {
        if(totalnoofseat>seats)
        {
            totalnoofseat=totalnoofseat-seats;
            System.out.println("Ticket Booked");
        }
        else
        {
            System.out.println("ticket not available");
        }
    }
}
public class Newsync extends Thread
{
    static bookticket b1;
    int seats;
    public void run()
    {
        b1.book1(seats);
    }
    public static void main(String [] args)
    {

        b1 = new bookticket();
        Newsync n1 = new Newsync();
        n1.seats=8;
        n1.start();
    }
}
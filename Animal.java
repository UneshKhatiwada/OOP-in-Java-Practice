class Final
{

    int eye;
    int head;
    void eat()
    {
        System.out.println("I am eating");
    }
}
    class Bird extends Final 
    {
    void fly()
    {
        System.out.println("I can fly");
    }
        
  }
    class Animal
    {
    public static void main(String[]args)
    {
        Bird b1 = new Bird();
        b1.eye=2;
        b1.head=1;
        System.out.println("Value is:" +b1.eye);
        System.out.println("Value is:" +b1.head);

        b1.eat();
        b1.fly();
    }
    }

class Addition
{
    int a;
    int b;
    void add(int a, int b)
    {
    
        System.out.println("Sum is " +(a+b));
    }
}
class Subtraction extends Addition
{
    void sub(int a, int b)
    {
        System.out.println("Sub is " +(a-b));
    }

}
class Multiplication extends Subtraction
{
    void multi(int a, int b)
    {
        System.out.println("Multi is " +(a*b));
    }


}
 class Calculation
{
    public static void main(String[]args)
    {

        Multiplication m1 = new Multiplication();
        m1.add(2, 4);
        m1.sub(4, 8);
        m1.multi(4, 8);

    }

}

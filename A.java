 class A 
{
    int a,b;
    void Sum()
    {
        int total;
        total = a+b;
        System.out.println("Total:"+ total);
    }
    public static void main (String[] args)
    {
        A a1 = new A();
        a1.a=10;
        a1.b=12;
        a1.Sum();
    }
}

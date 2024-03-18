
class A
{
   int a;
   int b;
    void sum()
        {
            System.out.println("sum is :" +a+b);  
        }
}
class B extends A
{
    void sum()
        {
            super.a=10;
            super.b=2;
   
        }
}
class ExampleSuper
{
    public static void main(String[]args)
    {
        A a1= new A();
        a1.sum();

    }

}

 
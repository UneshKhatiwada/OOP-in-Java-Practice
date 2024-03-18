class Sum
{
     int a;
     int b;
    
    void get(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    void set(){
    int sum;
    sum = a+b;
    System.out.println("Sum:"+ sum);
   }
    public static void main (String[] args)
    {
        Sum s1 = new Sum();
        s1.get(5, 7);
        s1.set();
    //Method overloading
    }
}
public class Product 
{
    int a;
    int b;
void get(int a, int b)
{
    this.a=a;
    this.b=b;
}
void set()
{
    int pro;
    pro = a*b;
    System.out.println("Multiple of a and b :"+pro);
}
public static void main(String[]args) 
{
    Product p1 = new Product();
    p1.get(5,5);
    p1.set();
}
}
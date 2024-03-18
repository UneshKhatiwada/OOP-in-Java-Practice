public class Box{
    double l,b,h,area;
     Box(double x,double y, double z)
    {
    l=x;
    b=y;
    h=z;
    }

public void calculate()
  {
    area = l*b*h;
    System.out.println("The area of box is:" +area);
 }
}
public class Constructor{
    public static void main(String[]args)
    {
    Box b1 = new Box(10, 5, 3.3);
    b1.calculate();
}
}
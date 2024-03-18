public class getSet
{
    int x;
    int y;

void setA(int x, int y)
{
    this.x=x;
    this.y=y;
}

int getA()
{
    int result;
    result=x+y;
    return result;
}
public static void main(String[]args)
{
    int x =1;
    int y = 2;
    int r;
    getSet g1 = new getSet();
    g1.setA(x,y);
    r = g1.getA();
    System.out.println("The sum is :"+ r);
}
}
//what is inheritance. explain with example?
// what are the different classes in java?

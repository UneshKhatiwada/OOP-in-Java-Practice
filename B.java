public class B 
{
    int i;
    int j;

  B( int i,int j)
    {
        this.i=i;
        this.j=j;
    }
    void add(){
        int sum=i+j;
        System.out.println("Sum is :"+sum);
    }
     
     
    public static void main(String[]args)
    {
        B b1 = new B(6,9);
        b1.add();
    

    }
    
}

     



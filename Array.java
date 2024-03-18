class Array
{
    public static void main (String [] args)
    {
        String a[] = {"Ram", "Shyam", "Hari"};

        try 
        {
            System.out.println("Name:" +a[3]);

        } 
        catch (ArrayIndexOutOfBoundException e) 
        {
            System.out.println("Index is greater than Array");
        }
    }
}

//Multiple Catch Statements
//Finally Statements
/*
 try
 {
    statement;
 }
 catch(A.E)
 {
  statement;
 }
 catch(Array.Index)
 {
  statement;
 }
 catch(Null)
 {
  statement;
 }
 Finally
 {

 }
 */
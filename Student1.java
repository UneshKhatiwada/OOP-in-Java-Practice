class Sports
{
    String name;
    int id;
}
class Library
{
    String name;
    int id;
}
public class Student1 
{
    int id;
    String name;

    public static void main(String[]args)
    {
        //Object creating
        Student1 s1 = new Student1();
        s1.id = 100;
        s1.name = "Unesh";
        System.out.println("id :" + s1.id);
        System.out.println("name :" + s1.name);

        Sports s2 = new Sports();
        s2.name= "Nabin";
        s2.id= 101;
        System.out.println("id:" + s2.id);
        System.out.println("name:" + s2.name);

        Library s3 = new Library();
        s3.name= "Subarna";
        s3.id= 102;
        System.out.println("id:" + s3.id);
        System.out.println("name:" + s3.name);
    }
}

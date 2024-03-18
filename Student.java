public class Student {
    int rno;
    String name;
    public Student(int rno, String name) 
    {
       this.rno=rno;
       this.name=name;
    }
    public void display() 
    {  
       System.out.println("Roll Number: " + rno);
       System.out.println("Name: " + name);
    }
    public static void main(String[] args) 
    {
       Student s = new Student(26, "Subarna");
       s.display();
    }
 }

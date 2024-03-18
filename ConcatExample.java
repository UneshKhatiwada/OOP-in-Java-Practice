public class ConcatExample 
{
    public static void main(String []args)
    {
        String s1 = "My name";
        String s2 = "is";
        String s3 = "Subarna Khatiwoda";

        String s4 = s1.concat(s2);
        System.out.println(s4);
        String s5 = s1.concat(s2).concat(s3);
        System.out.println(s5);
    }
}

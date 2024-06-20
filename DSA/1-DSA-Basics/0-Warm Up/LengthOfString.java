import java.util.Scanner;
public class LengthOfString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int c=0;
        char[] chararray = str.toCharArray();
        
        for(@SuppressWarnings("unused") char ch : chararray)
        {
            c++;
        }
        System.out.println(c);
        sc.close();
    }
}
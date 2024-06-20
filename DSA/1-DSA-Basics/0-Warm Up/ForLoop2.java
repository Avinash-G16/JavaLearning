import java.util.Scanner;
public class ForLoop2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0;i<str.length();i=i+2)
        {
            System.out.print(str.charAt(i)+" ");
        }
        sc.close();
    }
}
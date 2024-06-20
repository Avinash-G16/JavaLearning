import java.util.Scanner;
public class Substring
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<0 || b<0 || a>=str.length() || b>=str.length() || a>b)
        {
            System.out.println("Invalid index");
        }
        else
        {
            for(int i = a;i<=b;i++)
            {
                System.out.print(str.charAt(i));
            }
        }
        sc.close();
    }
}
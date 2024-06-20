import java.util.Scanner;
public class ExceptionHandling
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        try
        {
            int div = n1/n2;
            System.out.println(div);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
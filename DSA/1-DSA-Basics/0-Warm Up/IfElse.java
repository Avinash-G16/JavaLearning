import java.util.Scanner;
public class IfElse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==5)
        {
            System.out.println("Equal to 5");
        }
        else if(n>5)
        {
            System.out.println("Greater than 5");
        }
        else
        {
            System.out.println("Less than 5");
        }
        sc.close();
    }
}
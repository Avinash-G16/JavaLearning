import java.util.Scanner;
public class APTerm
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term of AP: ");
        int a = sc.nextInt();
        System.out.print("Enter common difference: ");
        int d = sc.nextInt();
        System.out.print("Enter term to find out: ");
        int n = sc.nextInt();
        System.out.print("Nth term is: "+ (a+(n-1)*d));
        sc.close();
    }
}
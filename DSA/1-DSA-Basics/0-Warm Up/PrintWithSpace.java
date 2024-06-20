import java.util.Scanner;
public class PrintWithSpace
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(a+" "+b);
        sc.close();
    }
}
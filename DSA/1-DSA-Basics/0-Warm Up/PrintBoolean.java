import java.util.Scanner;
public class PrintBoolean
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        boolean b = sc.nextBoolean();
        System.out.println(b);
        sc.close();
    }
}
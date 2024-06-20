import java.util.Scanner;
public class TypeConversion
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        int i = (int) d;
        System.out.println(i);
        sc.close();
    }
}
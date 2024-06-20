import java.util.Scanner;
public class Computea_b
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = (double)a/b;
        System.out.format("%.2f", c);
        sc.close();
    }
}
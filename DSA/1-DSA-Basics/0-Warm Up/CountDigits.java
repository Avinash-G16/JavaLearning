import java.util.Scanner;
public class CountDigits
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c = 0;
        while(num>0)
        {
            c++;
            num/=10;
        }
        System.out.println(c);
        sc.close();
    }
}
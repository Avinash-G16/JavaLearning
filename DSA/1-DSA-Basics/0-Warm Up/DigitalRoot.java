import java.util.Scanner;
public class DigitalRoot
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum;
        if(n%9==0)
        {
            sum = 9;
        }
        else
        {
            sum = n%9;
        }
        System.out.println(sum);
        sc.close();
    }
}
import java.util.Scanner;
public class FirstDigitOfANumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while(n>=10)
        {
            n/=10;
            ans = n;
        }
        System.out.println(ans);
        sc.close();
    }
}
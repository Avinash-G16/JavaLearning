import java.util.Scanner;
public class ForLoopPrimeCheck
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = IsPrime(num);
        System.out.println(ans);
        sc.close();
    }
    static boolean IsPrime(int num)
    {
        boolean ans = true;
        if(num==1)
        {
            ans = false;
        }
        for(int i = 2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                ans = false;
            }
        }
        return ans;
    }
}
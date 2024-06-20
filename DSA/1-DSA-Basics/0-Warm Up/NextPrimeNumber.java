import java.util.Scanner;
public class NextPrimeNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num++;
        while(!prime(num))
        {
            num++;
        }
        System.out.println(num);
        sc.close();
    }
    static boolean prime(int n)
    {
        boolean flag = true;
        for(int i = 2; i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
import java.util.Scanner;
public class Factorial
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long fact = FactByRecursion(num);
        System.out.println(fact);
        fact = FactByIteration(num);
        System.out.println(fact);
        sc.close();
    }
    static long FactByIteration(int num)
    {
        long ans = 1;
        if(num==0 || num==1)
        {
            return 1;
        }
        for(int i = 2;i<=num; i++)
        {
            ans = ans*i;
        }
        return ans;
    }
    static long FactByRecursion(int num)
    {
        if(num==0 || num==1)
        {
            return 1;
        }
        else
        {
            return num*FactByRecursion(num-1);
        }
    }
}
import java.util.Scanner;
public class SumDefaultArguments
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sumoftwo = sum(a,b);
        int sumofthree = sum(a,b,c);
        int sumoffour = sum(a,b,c,d);
        System.out.println(sumoftwo);
        System.out.println(sumofthree);
        System.out.println(sumoffour);
        sc.close();
    }

    static int sum(int a,int b, int...c)
    { 
        int sum = a+b;
        for(int value : c)
        {
            sum+=value;
        }
        return sum;
    }
}
import java.util.Scanner;
public class CheckPrime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = true;
        for(int i = 2; i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                flag = false;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("Not prime");
        }
        else
        {
            System.out.println("Prime");
        }
        sc.close();
    }
}
import java.util.Scanner;
public class Divisor
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        for(int i = 1; i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                if(num/i!=i)
                {
                    System.out.print(i+" "+ num/i + " ");
                }
                else
                {
                    System.out.print(num/i);
                }   
            }
        }
        System.out.println();
        //in sorted order
        int j;
        for(j = 1;j<Math.sqrt(num);j++)
        {
            if(num%j==0)
            {
                System.out.print(j+" ");
            }
        }
        if(j-num/j==1)
        {
            j--;
        }
        for(;j>=1;j--)
        {
            if(num%j==0)
            {
                System.out.print(num/j+" ");
            }
        }
    }
}
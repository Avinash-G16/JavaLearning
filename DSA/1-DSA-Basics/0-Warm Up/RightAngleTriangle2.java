import java.util.Scanner;
public class RightAngleTriangle2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i<num;i++)
        {
            for(int j = 0; j<=i;j++)
            {
                if(i==0 || i==num-1)
                {
                    System.out.print("*");
                }
                else
                {
                    if(j == 0 || j==i)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
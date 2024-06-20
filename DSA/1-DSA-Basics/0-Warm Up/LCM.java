import java.util.Scanner;
public class LCM
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if(a==0 || b==0)
        {
            System.out.println(0);
        }
        else
        {
            while(max%min!=0)
            {
                max = max+max;
            }
            System.out.println(max);
        }
        sc.close();
    }
}
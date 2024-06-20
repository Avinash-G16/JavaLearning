import java.util.Scanner;
public class CountOddEven
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++)
        {
            array[i] = sc.nextInt();
        }
        int odd = 0, even = 0;
        for(int i=0;i<n;i++)
        {
            if(array[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Even: "+ even + " Odd: "+odd);   
        sc.close();
    }
}
import java.util.Scanner;
public class MaxAndSecondMax
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        long max = Long.MIN_VALUE;
        long secondmax = Long.MIN_VALUE;
        for(int i = 0; i<n ;i++)
        {
            if(arr[i]>max)
            {
                secondmax = max;
                max = arr[i];
            }
            else if(arr[i]<max && arr[i]>secondmax)
            {
                secondmax  = arr[i];
            }
        }
        if(secondmax==Long.MIN_VALUE)
        {
            secondmax = -1;
        }
        System.out.println("Max: "+ max + " Min: "+secondmax);
        sc.close();
    }
}
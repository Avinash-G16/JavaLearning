import java.util.Scanner;
public class Average
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        int cnt=0;
        for(int i = 0; i<n; i++)
        {
            if(arr[i]>0)
            {
                sum+=arr[i];
                cnt++;
            }
        }
        if(cnt!=0)
        {
            double avg = (double)sum/cnt;
            System.out.println(avg);
        }
        else
        {
            System.out.println(0);
        }
        sc.close();
    }
}
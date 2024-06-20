import java.util.Scanner;
public class CountTheZeros
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
        int low = 0;
        int high = array.length-1;
        int index = Integer.MIN_VALUE;
        while(high>=low)
        {
            int mid = low + (high-low)/2;
            if(array[mid]==1)
            {
                low = mid;
            }
            else if(array[mid]==0)
            {
                if(array[mid-1]==0) 
                    high = mid;
                else
                    index = mid;
                    break;
            }
        }
        int count = array.length - index;
        System.out.println(count);
        sc.close();
    }
}
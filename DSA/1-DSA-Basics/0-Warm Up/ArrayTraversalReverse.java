import java.util.Scanner;
public class ArrayTraversalReverse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0;i<n;i++)
        {
            array[i] = sc.nextInt();
        }
        printArray(array, 0);
        System.out.println();
        printArray(array, n-1);
        sc.close();
    }
    static void printArray(int[] arr, int n)
    {
        if(n==0)
        {
            for(int i = n; i<arr.length; i++ )
            {
                System.out.print(arr[i]+" ");
            }
        }
        else
        {
            for(int i = n; i>=0;i--)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
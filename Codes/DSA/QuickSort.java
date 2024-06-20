package Codes.DSA;
import java.util.Scanner;
public class QuickSort
{
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j)
        {
            while(arr[i]<=pivot && i<=high-1)
            {
                i++;
            }
            while(arr[j]>pivot && j>=low + 1)
            {
                j--;
            }
            if(i<j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
    static void quickSort(int[] arr, int low, int high)
    {
        if(low<high) {
        int pivot = partition(arr, low, high);
        quickSort(arr, low, pivot-1);
        quickSort(arr, pivot+1, high);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.print("Array before sort operation: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(array[i]+ " ");
        }

        quickSort(array, 0, n-1);
        System.out.print("\nArray after sort operation: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(array[i]+ " ");
        }
        sc.close();
    }
}
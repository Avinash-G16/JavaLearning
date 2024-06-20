package Codes.DSA;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size for array: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: ");
        int[] array = new int[n];
        for(int i=0; i<n;i++)
        {
            array[i] = sc.nextInt();
        }
        int[] sortedarray = bubbleSort(array, n);
        for(int i: sortedarray)
        {
            System.out.print(i+" ");
        }
        sc.close();
    }
    static int[] bubbleSort(int arr[], int n)
    {
        for(int i = 0; i<arr.length;i++)
        {
            boolean flag = false;
            for(int j = 0;j<arr.length-i-1;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag)
            {
                break;
            }
        }
        return arr;
    }
}
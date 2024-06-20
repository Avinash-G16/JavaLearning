package Codes.DSA;

import java.util.Scanner;

public class SelectionSort {
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
        sc.close();
        int[] sortedarray = selectionSort(array, n);
        for(int i: sortedarray)
        {
            System.out.print(i+" ");
        }
    }
    static int[] selectionSort(int arr[], int n)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}

package Codes.DSA;

import java.util.Scanner;

public class InsertionSort {
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
        int[] sortedarray = insertionSort(array, n);
        for(int i: sortedarray)
        {
            System.out.print(i+" ");
        }
    }
    static int[] insertionSort(int arr[], int n)
    {
        for(int i = 1; i<arr.length;i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}

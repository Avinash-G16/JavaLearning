package Codes.DSA;
import java.util.Scanner;

public class MergeSort {
    static void mergeSort(int[] arr, int low, int high)
    {
        if(low>=high) return;
        int mid = low + (high-low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low,mid,high);
    }
    static void merge(int arr[], int low, int mid, int high)
    {
        int s1 = mid - low + 1;
        int s2 = high - mid;
        int[] L1 = new int[s1];
        int[] L2 = new int[s2];

        for(int i = 0; i<s1; i++)
        {
            L1[i] = arr[i+low];
        }
        for(int i = 0; i<s2; i++)
        {
            L2[i] = arr[mid+1+i];
        }
        
        int i = 0, j = 0;
        int k = low;
        while(i<s1 && j<s2)
        {
            if(L1[i]<=L2[j])
            {
                arr[k] = L1[i];
                i++;
            }
            else
            {
                arr[k] = L2[j];
                j++;
            }
            k++;
        }
        while(i<s1)
        {
            arr[k] = L1[i];
            i++; k++;
        }
        while(j<s2)
        {
            arr[k] = L2[j];
            j++; k++;
        }
    }
    public static void main(String args[]){
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

        mergeSort(array, 0, n-1);
        System.out.print("\nArray after sort operation: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(array[i]+ " ");
        }
        sc.close();
    }
}
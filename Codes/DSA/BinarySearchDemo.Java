package Codes.DSA;
import java.util.Scanner;
public class BinarySearchDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size for array: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: ");
        int[] array = new int[n];
        for(int i=0; i<n;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter target to search: ");
        int target = sc.nextInt();
        int index = binarySearch(array, target);
        if(index==-1)
        {
            System.out.println("Record not found");
        }
        else
        {
            System.out.println("Found at: "+index);
        }
        index = binarySearchRecursive(array, target,0,array.length-1);
        if(index==-1)
        {
            System.out.println("Record not found");
        }
        else
        {
            System.out.println("Found at: "+index);
        }
        sc.close();
    }
    static int binarySearch(int a[], int target)
    {
        int start = 0;
        int end = a.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(a[mid]==target)
            {
                return mid;
            }
            else if(a[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return -1;
    }
    static int binarySearchRecursive(int a[], int target, int left, int right)
    {
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(a[mid]==target)
            {
                return mid;
            }
            else if(a[mid]>target)
            {
                
                return binarySearchRecursive(a, target, left, mid-1);
            }
            else
            {
                return binarySearchRecursive(a, target, mid+1, right);
            }
        }
        return -1;
    }
}
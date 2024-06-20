package Codes.DSA;
import java.util.Scanner;
public class LinearSearch 
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
        int index = linearSearch(array, target);
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
    static int linearSearch(int a[], int target)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
import java.util.Scanner;
public class LinearSearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i<n; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int number = sc.nextInt();
        int index = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            if(array[i]==number)
            {
                index = i;
            }
        }
        if(index!=Integer.MIN_VALUE)
        {
            System.out.println("Found at: "+index);
        }
        else
        {
            System.out.println("Not found");
        }
        sc.close();
    }
}
import java.util.Scanner;
public class ArrayInsertAtIndex
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
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        sc.close();
        int[] newarray = new int[n+1];
        int i;
        for(i = 0; i<index; i++)
        {
            newarray[i] = array[i];
        }
        newarray[i] = num;
        i++;
        for(;i<n+1;i++)
        {
            newarray[i] = array[i-1];
        }
        for(int j = 0; j<n+1; j++)
        {
            System.out.print(newarray[j]+ " ");
        }
    }
}
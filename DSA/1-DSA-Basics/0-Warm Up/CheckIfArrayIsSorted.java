import java.util.Scanner;
public class CheckIfArrayIsSorted
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
        boolean flag = true;
        for(int i = 0; i<n-1; i++)
        {
            if(array[i+1]<array[i])
            {
                flag = false;
            }
        }
        System.out.println(flag);
        sc.close();
    }
}
import java.util.Scanner;
public class NeedSomeChange
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++)
        {
            array[i] = sc.nextInt();
        }
        for(int i = 0; i+2<n; i++)
        {
            array[i] = array[i] + array[i+2];
            array[i+2] = array[i] - array[i+2];
            array[i] = array[i] - array[i+2];
        }
        for(int i = 0; i<n; i++)
        {
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}
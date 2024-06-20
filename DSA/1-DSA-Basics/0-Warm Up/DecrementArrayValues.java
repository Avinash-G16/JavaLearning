import java.util.Scanner;
public class DecrementArrayValues
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for(int i = 0; i<num; i++)
        {
            array[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i<num; i++)
        {
            --array[i];
            System.out.print(array[i]+" ");
        }
    }
}
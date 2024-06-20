import java.util.Scanner;
public class SizeOfAnArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] array = {0,1,2,3,4,5,5,7,8,8};
        int c=0;
        for(@SuppressWarnings("unused") int i:array)
        {
            c++;
        }
        System.out.print(c);
        sc.close();
    }
}
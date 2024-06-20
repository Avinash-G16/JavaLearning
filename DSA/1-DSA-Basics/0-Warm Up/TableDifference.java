import java.util.Scanner;
public class TableDifference
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.print("Difference: ");
        for(int i = 1; i<=10;i++)
        {
            System.out.print((n1*i - n2*i)+ " ");
        }
        sc.close();
    }
}
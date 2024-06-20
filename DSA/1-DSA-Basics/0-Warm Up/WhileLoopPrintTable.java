import java.util.Scanner;
public class WhileLoopPrintTable
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 10;
        while(i>0)
        {
            System.out.print(num*i + " ");
            i--;
        }
        sc.close();
    }
}
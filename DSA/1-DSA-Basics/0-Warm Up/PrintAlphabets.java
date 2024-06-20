import java.util.Scanner;
public class PrintAlphabets
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        c1++;
        while(c1<c2)
        {
            System.out.print(c1+" ");
            c1++;
        }
        sc.close();
    }
}
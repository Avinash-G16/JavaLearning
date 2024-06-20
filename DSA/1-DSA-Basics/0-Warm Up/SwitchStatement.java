import java.util.Scanner;
public class SwitchStatement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num)
        {
            case 1:
            System.out.println("One");
            break;
            default:
            System.out.println("Not One");
        }
        sc.close();
    }
}
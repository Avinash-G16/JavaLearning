import java.util.Scanner;
public class EvenOddGame
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        int apple = sc.nextInt();
        if(apple%2!=0)
        {
            System.out.println("You");
        }
        else
        {
            System.out.println("Friend");
        }
        sc.close();
    }
}
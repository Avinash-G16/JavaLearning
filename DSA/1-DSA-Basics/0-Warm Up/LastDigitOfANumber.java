import java.util.Scanner;
public class LastDigitOfANumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Last digit of this number is: "+ n%10);
        sc.close();
    }
}

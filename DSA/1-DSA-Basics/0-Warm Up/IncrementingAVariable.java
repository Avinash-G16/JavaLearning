import java.util.Scanner;
public class IncrementingAVariable
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Before incrementing: "+ num);
        Increment(num);
        sc.close();
    }
    static void Increment(int num)
    {
        num = num+10;
        System.out.println("After incrementing: "+num);
    }
}
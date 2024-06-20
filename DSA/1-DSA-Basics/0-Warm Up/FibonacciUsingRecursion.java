import java.util.Scanner;
public class FibonacciUsingRecursion
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fib = fibonacci(n);
        System.out.println(fib);
        sc.close();
    }
    static int fibonacci(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else if(n==2)
        {
            return 1;
        }
        else
        {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
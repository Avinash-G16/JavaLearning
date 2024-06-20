import java.util.Scanner;
public class AddTwoNumbers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        fn add = (int x, int y) -> x + y;
        AddTwoNumbers tobj = new AddTwoNumbers();
        System.out.println("Addition is " + tobj.operate(a,b, add));
        sc.close();
    }
    interface fn
    {
        int fun(int x, int y);
    }
    private int operate(int a, int b, fn fobj)
    {
        return fobj.fun(a, b);
    }
}
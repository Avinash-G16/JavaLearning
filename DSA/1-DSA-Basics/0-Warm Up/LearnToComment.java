import java.util.Scanner;
public class LearnToComment
{
    public static void main(String arr[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        System.out.println(a);
        //System.out.println(b); this is single line comment
        /*
         this is multiline comment
        */
        System.out.println(b);
        System.out.println(c);
        sc.close();
        //\u000d System.out.println("But this will be magically executed!");
    }
}
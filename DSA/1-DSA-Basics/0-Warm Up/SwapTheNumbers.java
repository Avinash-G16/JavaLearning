import java.util.Scanner;
public class SwapTheNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //with temp variable
        System.out.println("Before Swap: "+ a +" "+ b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: "+a+" "+b);
        //Without temp variable
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("Before Swap: "+ c+ " "+d);
        c = c + d;
        d = c - d;
        c = c - d;
        System.out.println("After Swap: "+c+" "+d);

        //Using multiplication and division
        int e = sc.nextInt();
        int f = sc.nextInt();
        System.out.println("Before Swap: "+e+" "+f);
        if(e==0)
        {
            e = f;
            f = 0;
        }
        else if(f==0)
        {
            f = e;
            e = 0;
        }
        else
        {
            e = e*f;
            f = e/f;
            e = e/f;
        }
        System.out.println("After Swap: "+e+" "+f);

        //using xor
        int g = sc.nextInt();
        int h = sc.nextInt();
        System.out.println("Before Swap: "+g+" "+h);
        g = g^h;
        h = g^h;
        g = g^h;
        System.out.println("After Swap: "+g+" "+h);
        //one line expression
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println("Before Swap: "+i+" "+j);
        i = (i*j)/(j = i); //only if none of two is 0
        System.out.println("After Swap: "+i+" "+j);
        sc.close();
    }
}
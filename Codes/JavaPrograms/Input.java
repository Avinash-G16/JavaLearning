import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("Enter a number: ");
        int num = System.in.read(); //returns the ascii value of key
        System.out.println(num-48);
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num1 = Integer.parseInt(bf.readLine());
        System.out.println(num1);
        bf.close();
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        System.out.println(num2);
        sc.close();
    }
}
import java.util.Scanner;
public class SumOfNumberInString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        int number = 0;
        for(int i= 0; i<str.length(); i++)
        {
            if(str.charAt(i) - 48 >= 0 && str.charAt(i) - 48 < 9)
            {
                number = number*10 + (str.charAt(i) - 48);
            }
            else
            {
                sum+=number;
                number = 0;
            }
        }
        sum+=number;
        System.out.println(sum);
        sc.close();
    }
}
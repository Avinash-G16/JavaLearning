import java.util.Scanner;

public class ConvertToHexadecimal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String hexa1 = toHexa(decimal);
        System.out.println(hexa1);
        String hexa2 = toHexaUsingUnicode(decimal);
        System.out.println(hexa2);
        sc.close();
    }
    static String toHexa(int num)
    {
        String ans = "";
        while(num!=0)
        {
            int rem = num%16;
            String temp = "";
            switch(rem)
            {
                case 10:
                    temp = "A";
                    break;
                case 11:
                    temp = "B";
                    break;
                case 12:
                    temp = "C";
                    break;
                case 13:
                    temp = "D";
                    break;
                case 14:
                    temp = "E";
                    break;
                case 15:
                    temp = "F";
                    break;
                default:
                    temp = String.valueOf(rem);
            }
            ans = temp+ans;
            num = num/16;
        }
        return ans;
    }
    static String toHexaUsingUnicode(int num)
    {
        String ans = "";
        while(num!=0)
        {
            int rem = num%16;
            char c;
            if(rem<10)
            {
                c = (char)(rem+48);
            }
            else
            {
                c = (char)(rem+55);
            }
            ans = c + ans;
            num/=16;
        }
        return ans;
    }
}
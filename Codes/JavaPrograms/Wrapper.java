public class Wrapper
{
    public static void main(String args[])
    {
        int n = 12; //primitive data type
        Integer num = n; //Reference data type // Auto-boxing

        // Integer num1 = new Integer(n); //boxing //depricated

        int num2 = num.intValue(); //unboxing
        int num3 = num; //auto unboxing
        System.out.println(num + " " +n + " "+ num2 + " " + num3);

        String str = "12";
        int num4 = Integer.parseInt(str);

        System.out.println(num4 * 2);

    }
}
public class DataTypes
{
    public static void main(String arr[])
    {
        int a = 5;
        float b = 10.5f;
        double c = 20.00;
        long l = 500000;
        String d = "Avinash";
        double res = b/c;
        float res2 = b/a;
        int res3 = (int) c/a;
        long l2 = res3 + l;
        System.out.println(d+" "+d.charAt(3));
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(l2);
    }
}
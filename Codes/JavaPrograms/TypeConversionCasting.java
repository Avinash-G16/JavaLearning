public class TypeConversionCasting {
    public static void main(String args[]) {
        byte b = 127;
        System.out.println(b);
        int a = 267;
        byte k = (byte) a; //gets the result using modulo op for byte range in -128 to 127
        System.out.println(k);
        float f = 4.6f;
        int i = (int) f;
        System.out.println(i);
        // type promotion
        byte b1 = 10;
        byte b2 = 30;
        int result = b1 * b2;
        System.out.println(result);
    }
}
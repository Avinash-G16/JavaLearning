public class IfElseIf {
    public static void main(String args[]) {
        int x = 8;
        int y = 7;
        int z = 6;
        if (x > y && x > z) {
            System.out.println(x); //8
        } else if (y > z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }
    }
}
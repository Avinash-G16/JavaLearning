public class Ternary {
    public static void main(String args[]) {
        int n = 5;
        boolean res = n % 2 == 0 ? true : false;
        if (res) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");//this will be printed here
        }
    }
}
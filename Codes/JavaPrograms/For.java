public class For {
    public static void main(String args[]) {
        int i = 1;
        for (i = 1; i <= 5; i++) {
            System.out.println("Hello " + i);
            for(int j = 1;j<=5;j++)
            {
                System.out.println("Bye " + j);
            }
        }
    }
}
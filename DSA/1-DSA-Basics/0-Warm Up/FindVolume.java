import java.util.Scanner;
public class FindVolume
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        System.out.println("Volume of cube: "+ s*s*s);
        System.out.println("Volume of cuboid: "+ l*b*h);
        sc.close();
    }
}
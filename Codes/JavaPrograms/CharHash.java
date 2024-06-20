import java.util.Scanner;
public class CharHash{
    public static void main(String[] args)
    {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        int n = sc.nextInt();
        int[] hash = new int[256];
        for(int i=0;i<s.length();i++)
        {
            hash[s.charAt(i)]++;
        }
        while(n!=0)
        {
            char c = sc.next().charAt(0);
            System.out.println(hash[c]);
            n--;
        }
        System.out.println(s);
        sc.close();
    }
}
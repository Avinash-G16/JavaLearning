import java.util.*;
import java.util.Scanner;
public class HashCharMap{
    public static void main(String a[])
    {
        String check = "";
        Scanner sc = new Scanner(System.in);
        check = sc.nextLine();
        HashMap <Character, Integer> hm = new HashMap<Character, Integer>();
        for(int i=0;i<check.length();i++)
        {
            char key = check.charAt(i);
            int freq = 0;
            if(hm.containsKey(key))
            {
                freq = hm.get(key);
            }
            freq++;
            hm.put(key,freq);
        }
        int q;
        q = sc.nextInt();
        while(q-->0)
        {
            char c;
            c = sc.next().charAt(0);
            if(hm.containsKey(c))
            {
                System.out.println(hm.get(c));
            }
            else
            {
                System.out.println(0);
            }
        }
        sc.close();
    }
}
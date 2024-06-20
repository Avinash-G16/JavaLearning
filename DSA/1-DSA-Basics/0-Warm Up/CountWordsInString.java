import java.util.Scanner;
public class CountWordsInString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int i = 0;
        int cnt = 0;
        for(;i<str.length()-1 && str.charAt(i)==' ';i++);
        if(i!=str.length()-1)
        {
            for(;i<str.length()-1;i++)
            {
                if(str.charAt(i)!=' ' && str.charAt(i+1)==' ')
                {
                    cnt++;
                }
            }
            if(str.charAt(i-1)!=' ')
            cnt++;
        }
        System.out.println(cnt);
    }
}
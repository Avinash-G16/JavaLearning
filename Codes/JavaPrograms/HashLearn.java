import java.util.Scanner;
public class HashLearn{
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[] hasharray = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println(hasharray[i]);
        }
        s.close();
        // int n;
        //  Scanner s = new Scanner(System.in);
        // System.out.println("Started");
        //  n = s.nextInt();
        //  int[] a = new int[n];
        //  for(int i=0;i<n;i++)
        //  {
        //      a[i] = s.nextInt();
        //  }
        // int[] hash = new int[13];
        // System.out.println(hash[0]);
        // for(int i=0;i<n;i++)
        // {
        //     hash[a[i]]+=1;
        // }

        
        // int n1 = s.nextInt();
        // while(n1!=0)
        // {
        //     int number;
        //     number = s.nextInt();
        //     System.out.println(hash[number]);
        //n--;
        // }
        // s.close();
    }
}
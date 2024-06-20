import java.util.Scanner;
public class MultiplyTheMatrice
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int o = sc.nextInt();
        int[][] A = new int[m][n];
        int[][] B = new int[n][o];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < o; j++)
            {
                B[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<o; j++)
            {
                for(int k = 0; k<o;k++)
                sum+=A[i][k]*B[k][j];
                System.out.print(sum+" ");
                sum = 0;
            }
        }
        sc.close();
    }
}
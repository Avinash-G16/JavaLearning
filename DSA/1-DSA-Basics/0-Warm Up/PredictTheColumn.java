import java.util.Scanner;
public class PredictTheColumn
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int cnt = 0;
        int[] tracker = new int[2];
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                int column = 0;
                if(matrix[j][i]==0)
                {
                    column = j;
                    cnt++;
                }
                if(cnt>tracker[1])
                {
                    tracker[0] = column;
                    tracker[1] = cnt;
                }
            }
            cnt = 0;
        }
        System.out.println(tracker[0]);
    }
}
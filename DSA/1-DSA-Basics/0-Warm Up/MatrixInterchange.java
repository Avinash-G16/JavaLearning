import java.util.Scanner;
public class MatrixInterchange
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n ; j++)
            {
                if(j==0)
                {
                    matrix[i][0] += matrix[i][n-1];
                    matrix[i][n-1] = matrix[i][0] - matrix[i][n-1];
                    matrix[i][0] -= matrix[i][n-1];
                }
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
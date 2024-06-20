import java.util.Scanner;
public class TransposeOfMatrix
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
        for(int i = 0; i<n; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                int temp = matrix[i][j];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
                System.out.print(matrix[j][i]+ " ");
            }
            System.out.println();
        }
    }
}
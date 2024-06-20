import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TryWithResources 
{
    public static void main(String args[]) throws IOException
    {
        int i = 0;
        try
        {
            int j = 18/i;
            System.out.println(j);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong "+ e);
        }
        finally
        {
            System.out.println("Bye");
        }
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)))
        {
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }//once the try ends bf is auto closed
    }    
}

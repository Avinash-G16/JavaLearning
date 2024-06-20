public class TryCatch
{
    public static void main(String args[])
    {
        try
        {
            int i = 0;
            int j = 18/i;
            System.out.println(j);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong " + e);
            System.out.println("Cannot divide by 0");
        }
        
        System.out.println("Bye"); //not executed if try catch not used 
    }
}
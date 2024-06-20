class AvinashException extends Exception
{
    public AvinashException(String str)
    {
        super(str);
    } 
}
public class CustomException
{
    public static void main(String args[])
    {
        int j=0;
        try
        {
            if(j==0)
            {
                throw new AvinashException("Hey I am in custom exception");
            }
        }
        catch(AvinashException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
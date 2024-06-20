public class MultipleCatch
{
    public static void main(String args[])
    {
        int i = 0;
        int j = 0;
        int[] nums = new int[5];
        // String str = null;
        try
        {
            if(j==0)
            {
                throw new ArithmeticException("I don't want to print 0");
            }
            int res = i/j;
            System.out.println(res);
            System.out.println(nums[5]);// if code breaks at printing res it will not be executed further
            // System.out.println(str.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by 0" + e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Cannot access element out of bound of array limit");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }
    }
}
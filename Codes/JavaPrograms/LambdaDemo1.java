public class LambdaDemo1
{
    public static void main(String args[])
    {
        DemoFinter obj = (i,j) -> i+j;
        //or
        /*DemoFinter obj = (i,j) -> {
            return (i+j);
        }; */
        int result = obj.add(12,5);
        System.out.println(result);
    }
}

@FunctionalInterface
interface DemoFinter
{
    int add(int i, int j);
}
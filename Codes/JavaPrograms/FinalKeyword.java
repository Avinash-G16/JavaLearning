// final - can be used with - Variable, method, class

public class FinalKeyword
{
    public static void main(String args[])
    {
        F obj  = new F();
        obj.show();
        obj.add(4,5);
        // final int num = 8; //num becomes constant, value cannot be changes further
        // System.out.println(num);
    }
}

final class F //cannot be inherited further
{
    public void show()
    {
        System.out.println("in F show");
    }
    public void add(int a,int b)
    {
        System.out.println(a + b);
    }
}
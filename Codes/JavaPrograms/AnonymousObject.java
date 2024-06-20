public class AnonymousObject
{
    public static void main(String args[])
    {
        new A().show(); // Anonymous object;
    }
}

class A
{
    public A()
    {
        System.out.println("Object created");
    }
    public void show()
    {
        System.out.println("In a show");
    }
}
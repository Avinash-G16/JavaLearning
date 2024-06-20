public class ThisAndSuper
{
    public static void main(String args[]) throws ClassNotFoundException
    {
        B obj = new B(5);
        System.out.println(obj);

        Class.forName("A"); //loads the class without creating obj, just instatiating it
    }
}


class A extends Object//object class is there even if we don't mention it.
{
    public A()//this will be called because super is not parameterized here
    {
        super();
        System.out.println("In A");
    }
    public A(int n)
    {
        super();
        System.out.println("In A int");
    }
}

class B extends A
{
    public B()
    {
        super();
        System.out.println("In B");
    }
    public B(int n)
    {
        this();//it will execute the constructor of the same class
        System.out.println("In B int");
    }
}
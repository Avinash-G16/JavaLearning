public class MethodOverRiding
{
    public static void main(String args[])
    {
        Abc2 obj = new Abc2();
        obj.show();
        obj.config();
    }
}

class Abc
{
    public void show()
    {
        System.out.println("In Abc Show");
    }
    public void config()
    {
        System.out.println("In Abc config");
    }
}

class Abc2 extends Abc
{
    public void show() //overriding the show method of parent class - Method overriding
    {
        System.out.println("In Abc2 show");
    }
}
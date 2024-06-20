public class Annotation
{
    public static void main(String args[])
    {
        ChildClass obj = new ChildClass();
        obj.show();
    }
}

class BaseClass
{
    public void show()
    {
        System.out.println("In base class method");
    }
}
class ChildClass extends BaseClass
{
    @Override           //annotation
    public void show()
    {
        System.out.println("In child class method");
    }
}
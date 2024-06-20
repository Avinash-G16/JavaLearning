public class UpcastingDowncasting
{
    public static void main(String args[])
    {
        parent obj = new child(); // upcasting
        obj.show1();

        child obj1 = (child) obj; // downcasting
        obj1.show2();
    }
}


class parent
{
    public void show1()
    {
        System.out.println("In parent show1");
    }
}

class child extends parent
{
    public void show2()
    {
        System.out.println("In child show2");
    }
}
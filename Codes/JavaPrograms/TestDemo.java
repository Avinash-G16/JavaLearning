public class TestDemo
{
    public static void main(String args[])
    {
        AlienClass a = new AlienClass();
        a.age = 50;
        System.out.println(a.age);
        AlienClass b = new AlienClass();
        System.out.println(b.age);
    }
}

class AlienClass
{
    int age;
    public void code()
    {
        System.out.println("code");
    }
}
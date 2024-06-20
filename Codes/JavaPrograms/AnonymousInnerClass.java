public class AnonymousInnerClass
{
    public static void main(String args[])
    {
        Ano obj = new Ano()
        {
            public void show()
            {
                System.out.println("In anonymous inner class");
            }
        };
        obj.show();
    }
}

class Ano
{
    public void show()
    {
        System.out.println("In Ano Show");
    }
}
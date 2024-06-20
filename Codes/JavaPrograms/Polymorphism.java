public class Polymorphism
{
    public static void main(String args[])
    {
        // Poly obj = new Poly1();//type/reference can be parent, object is child
        Poly obj = new Poly(); 
        obj.show();
        obj = new Poly1();
        obj.show(); //polymorphism - obj is behaving differently on different classes objects. This is possible only in case of inheritance

        Poly obj1 = new Poly1();
        obj1.show();
    }
}

class Poly
{
    public void show()
    {
        System.out.println("In Poly show");
    }
}
class Poly1 extends Poly
{
    public void show()
    {
        System.out.println("In Poly1 show");
    }
}
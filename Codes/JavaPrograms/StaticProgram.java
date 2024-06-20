public class StaticProgram
{
    public static void main(String args[]) /*throws ClassNotFoundException*/
    {
        // Class.forName("Mobile");
        Mobile mb1 = new Mobile();
        mb1.brand = "Apple";
        mb1.price = 70000;

        Mobile mb2 = new Mobile();
        mb2.brand = "Samsung";
        mb2.price = 100000;

        mb1.show();
        mb2.show();
        Mobile.show1(mb2);
    }
}


class Mobile
{
    String brand;
    int price;
    static String name; /*Instance variables*/

    static//static block
    {
        name = "Phone";
        System.out.println("In static block");
    }
    public Mobile()//constructor
    {
        brand = "";
        price = 200;
        System.out.println("In Constructor");
    }
    public void show()
    {
        System.out.println(brand +" : " +price +" : " +name );
    }
    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand +" : " +obj.price +" : " +name );
    }
}
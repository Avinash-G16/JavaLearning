public class InterfaceDemo
{
    public static void main(String args[])
    {
        Implementation obj = new Implementation();
        obj.show();
        obj.config();
        System.out.println(Inter.age);
    }
}
interface Inter
{
    int age = 24; //final and static
    void show();
    void config();
}
interface X
{
    void run();
}
interface Y extends X
{
    //inheritance is possible here
}
class Implementation implements Inter,X
{
    public void show()
    {
        System.out.println("In show");
    }
    public void config()
    {
        System.out.println("In config");
    }
    public void run()
    {
        System.out.println("running");
    }
}
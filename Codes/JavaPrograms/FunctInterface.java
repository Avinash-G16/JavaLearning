public class FunctInterface
{
    public static void main(String args[])
    {
        Fi obj = new Imp();
        obj.show();
    }
}
@FunctionalInterface
interface Fi
{
    void show();
}
class Imp implements Fi
{
    public void show()
    {
        System.out.println("In Show");
    }
}
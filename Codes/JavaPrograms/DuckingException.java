public class DuckingException
{
    static
    {
        System.out.println("Class Loaded");
    }
    public static void main(String args[])
    {
         Check c = new Check();
         try {
            c.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class Check
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("calc");
    }
}
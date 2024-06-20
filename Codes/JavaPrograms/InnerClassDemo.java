public class InnerClassDemo 
{
    public static void main(String args[])
    {
        Outer obj = new Outer();
        obj.show();
        ////Outer.Inner obj0 = new Outer.Inner();//does not work
        Outer.Inner obj1 = obj.new Inner(); // creating the obj of inner class
        Outer.Inner1 obj2 = new Outer.Inner1(); //it will work only if inner class is static
        obj1.config();
        obj2.config1();
    }   
}


class Outer
{
    int age;
    public void show()
    {
        System.out.println("In Show");
    }
    class Inner
    {
        public void config()
        {
            System.out.println("In Config");
        }
    }
    static class Inner1
    {
        public void config1()
        {
            System.out.println("In config 1");
        }
    }
}
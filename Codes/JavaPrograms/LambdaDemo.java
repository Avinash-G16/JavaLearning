public class LambdaDemo
{
    public static void main(String args[])
    {
        // DemoFi obj = new DemoFi() 
        // {
        //     public void show()
        //     {
        //         System.out.println("In show");
        //     }    
        // };
        // obj.show(); //equivalent code is written below
        DemoFi obj = () -> System.out.println("In show");
        obj.show();
        DemoFi1 obj1 = (i) -> System.out.println(i);
        //also possible  = DemoFi1 obj1 = i -> System.out.println(i);
        obj1.show(5);
    }
}

@FunctionalInterface
interface DemoFi
{
    void show();
}

@FunctionalInterface
interface DemoFi1
{
    void show(int i);
}
public class AbstractInnerClass
{
    public static void main(String args[])
    {
        //if we need to use show method only once why to create other class
        Demo obj = new Demo()
        {
            public void show()
            {
                System.out.println("In show in class");
            }
        };
        obj.show();
    }
}
abstract class Demo
{
    public abstract void show();
}
//// class Demo1 extends Demo
// {
//     public void show()
//     {
//         throw new UnsupportedOperationException("Unimplemented method 'show'");
//     }
    
// }
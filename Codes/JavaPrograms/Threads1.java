public class Threads1
{
    public static void main(String args[])
    {
        Runnable a = new Hi1();
        Runnable b = new Hello1();
        //// System.out.println(a.getPriority());
        //// b.setPriority(Thread.MAX_PRIORITY);
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
    }
}

class Hi1 implements Runnable
{
    public void run()
    {
        for(int i = 1; i<=5;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Hello1 implements Runnable
{
    public void run()
    {
        for(int i = 1; i<=5;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
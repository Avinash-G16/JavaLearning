public class Threads
{
    public static void main(String args[])
    {
        Hi a = new Hi();
        Hello b = new Hello();
        //// System.out.println(a.getPriority());
        //// b.setPriority(Thread.MAX_PRIORITY);
        a.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.start();
    }
}

class Hi extends Thread
{
    public void run()
    {
        for(int i = 1; i<=100;i++)
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
class Hello extends Thread
{
    public void run()
    {
        for(int i = 1; i<=100;i++)
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
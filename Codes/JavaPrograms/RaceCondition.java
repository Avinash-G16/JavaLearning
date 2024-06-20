class Counter
{
    int count;
    public synchronized void increment() //if we dont use synchronized key word, we will not get count value 20000 everytime, because at a time both threads can access it that might result in loss of operations, synchronized means now this part will be accessed by only one thread at a time
    {
        count++;
    }
}
public class RaceCondition
{
    public static void main(String args[]) throws InterruptedException
    {
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for(int i = 1; i<=10000;i++)
            {
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for(int i = 1; i<=10000;i++)
            {
                c.increment();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        t1.join();
        t1.join(); //waits thread to rejoin the main method after their individual executions
        System.out.println(c.count);
    }
}
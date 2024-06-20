class Main
{
    public static void main(String args[])
    {
        Computer lap = new Laptop();
        Computer desk = new Laptop();
        Developer avinash = new Developer();
        avinash.devApp(lap);
        avinash.devApp(desk);
    }
}

abstract class Computer
{
    public abstract void code();
}

class Developer
{
    // public void devApp(Laptop lap)  //passing only laptop is not good, as desktop also can be passed or in general - "Computer"
    // {
    //     lap.code();
    //     System.out.println("Coding..");
    // }
    public void devApp(Computer cap)
    {
        cap.code();
        System.out.println("Coding..");
    }
}
class Desktop extends Computer
{
    public void code()
    {
        System.out.println("Code, compile, run, faster");
    }
}
class Laptop extends Computer
{
    public void code()
    {
        System.out.println("Code, compile, run");
    }
}
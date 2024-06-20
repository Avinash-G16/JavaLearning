public class Abstract
{
    public static void main(String args[])
    {
        // Car obj = new Car();//cannot create the object of abstract class
        Car obj = new UpdatedWagonR();//this is possible
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}

abstract class Car
{
    public abstract void drive(); //only declaring the method
    public abstract void fly();
    public void playMusic()
    {
        System.out.println("Play music");
    }
}
abstract class WagonR extends Car
{
    public void drive()
    {//definition of function starts
        System.out.println("Driving..");
    }
}
class UpdatedWagonR extends WagonR  //concrete class
{
    public void fly()
    {
        System.out.println("Flying..");
    }
}
public class Constructor
{
    public static void main(String args[])
    {
        Human2 obj = new Human2();
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        Human2 obj1 = new Human2(18, "Jatin");
        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
        // obj.setName("Avinash");
        // obj.setAge(20);
        // System.out.println(obj.getName());
        // System.out.println(obj.getAge());
    }
}

class Human2
{
    private int age;
    private String name;

    public Human2() //default constructor
    {
        this.age = 12;
        this.name = "default";
    }

    public Human2(int a, String n)//parameterized constructor
    {
        this.age = a;
        this.name = n;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {
        this.age = a;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String s)
    {
        this.name = s;
    }
}
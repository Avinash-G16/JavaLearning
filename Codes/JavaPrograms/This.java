public class This
{
    public static void main(String args[])
    {
        Human1 obj = new Human1();
        obj.setName("Avinash");
        obj.setAge(20);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}

class Human1
{
    private int age;
    private String name;
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
public class Encapsulation
{
    public static void main(String args[])
    {
        Human obj = new Human();
        obj.setName("Avinash");
        obj.setAge(20);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}

class Human
{
    private int age; //encapsulation
    private String name; //encapsulation
    public int getAge()
    {
        return age;
    }//getter
    public void setAge(int a)
    {
        age = a;
    }//setter
    public String getName()
    {
        return name;
    }//getter
    public void setName(String s)
    {
        name = s;
    }//setter
}
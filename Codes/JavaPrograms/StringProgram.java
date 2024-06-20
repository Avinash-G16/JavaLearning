public class StringProgram
{
    public static void main(String args[])
    {
        String name = new String("Avinash"); //String is class
        name = name + "Student";// here changing the address not the exact string
        System.out.println("Hello " +name);
        System.out.println(name.hashCode());
        System.out.println(name.charAt(2));
        System.out.println(name.concat(" Gautam"));
        String s1 = "Gautam";
        String s2 = "Gautam";
        System.out.println(s1==s2);
    }
}
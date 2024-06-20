public class MethodOverloading
{
    public static void main(String args[])
    {
        Calc obj = new Calc(); // Obj is not the object, it is a reference variable
        int r1 = obj.add(3, 4);
        System.out.println(r1);
        int r2 = obj.add(3,4,5);
        // int r3 = obj.add(3.6, 5);
        System.out.println(r2);
        // System.out.println(r3);
    }
}

class Calc
{
    int num; //instance variable
    public int add(int n1, int n2) // local variables
    {
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }
    public double add(double n1, int n2)
    {
        return n1 + n2;
    }
    //number of parameters or type of parameters should change for overloading, return type does not guarantee overloading
}
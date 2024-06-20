
public class Inheritance
{
    public static void main(String args[])
    {
        VeryAdvCal obj = new VeryAdvCal();
        int r1 = obj.add(4,5);
        int r2 = obj.sub(7,3);
        int r3 = obj.multi(7,3);
        int r4 = obj.div(6,3);
        double r5 = obj.power(5, 3);
        System.out.println(r1 + " " + r2 + " "+r3 + " "+r4+" "+r5);

    }
}

class Cal
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int sub(int n1, int n2)
    {
        return n1-n2;
    }
}

class AdvCal extends Cal
{
    public int multi(int n1, int n2)
    {
        return n1*n2;
    }
    public int div(int n1, int n2)
    {
        return n1/n2;
    }
}


class VeryAdvCal extends AdvCal //multilevel inheritance
{
    public double power(int n1,int n2)
    {
        return Math.pow(n1, n2);

    }
}
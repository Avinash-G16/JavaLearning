sealed class S1 extends Thread implements Clonable permits S2,S3,S4
{

}
final class S2 extends S1
{

}
non-sealed class S3 extends S1 //other classes can inherite now S3 due to non sealed keyword
{

}
final class S4 extends S1 
{

}
public class SealedClass
{
    public static void main(String args[])
    {

    }
}
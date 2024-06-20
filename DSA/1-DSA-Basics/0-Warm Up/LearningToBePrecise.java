public class LearningToBePrecise
{
    public static void main(String arr[])
    {
        float a = 12.65678f;
        float b = 6.65678f;
        float result = a/b;
        System.out.print(result+" ");
        System.out.format("%.3f",result);
        //for double 
        double c = 0.9;
        System.out.println(" " + String.format("%.2f",c));
    }
}
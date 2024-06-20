import java.text.NumberFormat;
import java.text.DecimalFormat;
public class ScientificFormat
{
    public static void main(String args[])
    {
        NumberFormat nf = new DecimalFormat();
        double d = 10.5;
        nf = new DecimalFormat("0.000E0");
        System.out.println(nf.format(d));
    }
}
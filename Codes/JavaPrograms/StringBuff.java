public class StringBuff
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Avinash");
        System.out.println(sb.length());
        sb.append(" Gautam");
        sb.deleteCharAt(2);
        sb.insert(0,"Java ");
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);
    }
}
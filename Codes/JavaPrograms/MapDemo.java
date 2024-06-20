import java.util.HashMap;
import java.util.Map;
public class MapDemo
{
    public static void main(String args[])
    {
        Map<String, Integer> students = new HashMap<String,Integer>();
        students.put("Avinash", 16);
        students.put("Jatin", 20);
        students.put("Suresh",20);
        students.put("Maa", 18);
        System.out.println(students);
        students.put("Avinash",100);
        System.out.println(students);

        System.out.println(students.keySet());

        for(String key : students.keySet())
        {
            System.out.println(key + " : "+ students.get(key));
        }
    }
}
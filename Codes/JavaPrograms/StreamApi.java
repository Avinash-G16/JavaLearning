import java.util.Arrays;
import java.util.List;

public class StreamApi
{
    public static void main(String args[])
    {
        List<Integer> nums = Arrays.asList(4,5,2,1,10);
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n->n%2==0);
        // s1.forEach(n-> System.out.println(n));
        // s2.forEach(n-> System.out.println(n));
        // Stream<Integer> s3 = s2.map(n->n*2);
        // s3.forEach(n->System.out.println(n));
        // int result = s3.reduce(0, (c,e) -> c+e);
        // System.out.println(result);

        //or

        int result = nums.stream()
                         .filter(n->n%2==0)
                         .map(n->n*2)
                         .reduce(0, (c,e)-> c+e);
        System.out.println(result); 
    }
}
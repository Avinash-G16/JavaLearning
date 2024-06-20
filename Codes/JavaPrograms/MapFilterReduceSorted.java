import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MapFilterReduceSorted
{
    public static void main(String args[])
    {
        List<Integer> nums = Arrays.asList(4,5,2,1,10);

        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer n){
                if(n%2==0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        };
    //OR
        Predicate<Integer> p1 = (n)-> n%2==0;


        Function<Integer, Integer> fun = new Function<Integer, Integer>()
        {
            public Integer apply(Integer n)
            {
                return n*2;
            }
        };
        //or
        Function <Integer, Integer> fun1 = n -> n*2;

        System.out.println(p1 + " "+ fun1);

        int result = nums.stream()
                         .filter(p)
                         .map(fun)
                         .reduce(0, (c,e)-> c+e);
        Stream <Integer> sortedvalues = nums.stream().filter(p).sorted();

        Stream <Integer> sortedvalues1 = nums.parallelStream().filter(p);
                         
        System.out.println(result); 
        System.out.println(sortedvalues);
        System.out.println(sortedvalues1); 
    }
}
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamApiNeed
{
    public static void main(String args[])
    {
        List<Integer> nums = Arrays.asList(4,5,7,2,6,12,9);
        System.out.println(nums);
        int sum = 0;
        for(int n : nums)
        {
            if(n%2==0)
            {
                n = n*2;
                sum = sum+n;
            }
        }
        System.out.println(sum);

        nums.forEach(n -> System.out.println(n));

        Consumer<Integer> con = new Consumer<Integer>()
        {
            public void accept(Integer n)
            {
                System.out.println(n);
            }
        };
        nums.forEach(con);

        //or
        Consumer<Integer> con2 = n ->
         System.out.println(n);
        nums.forEach(con2);
    }
}
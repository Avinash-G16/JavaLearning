import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class CollectionDemo
{
    public static void main(String args[])
    {
        ///collection is an interface
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(6);
        nums.add(10);
        System.out.println(nums);
        for(int n: nums)
        {
            System.out.println(n);
        }
        List<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(5);
        nums1.add(6);
        nums1.add(10);
        System.out.println(nums1.get(2));


        //set
        Set<Integer> nums2 = new HashSet<Integer>();
        nums2.add(5);
        nums2.add(2);
        nums2.add(1);
        nums2.add(5);
        nums2.add(2);
        System.out.println(nums2);

        Set<Integer> nums3 = new TreeSet<Integer>();
        nums3.add(5);
        nums3.add(2);
        nums3.add(1);
        nums3.add(5);
        nums3.add(2);
        System.out.println(nums3);


        Iterator<Integer> values = nums.iterator();
        while(values.hasNext())
        {
            System.out.println(values.next());
        }
    }
}
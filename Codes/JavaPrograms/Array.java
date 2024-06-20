// import java.util.ArrayList;
// import java.lang.*; //this is imported by default

public class Array
{
    public static void main(String args[])
    {
        // ArrayList arr = new ArrayList();
        int num[] = {3,7,2,4};
        // System.out.println(num[1]);
        num[1] = 6;
        // System.out.println(num[1]);

        int nums[] = new int[4];
        // System.out.println(nums[0]);
        nums[0] = 2;
        nums[1] = 5;
        nums[2] = 12;
        nums[3] = 9;
        // System.out.println(nums[2]);
        for(int i=0;i<4;i++)
        {
            System.out.println(nums[i]);
        }
    }
}
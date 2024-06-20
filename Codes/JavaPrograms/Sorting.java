import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting
{
    public static void main(String args[])
    {
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(1);
        nums.add(3);
        nums.add(10);
        Collections.sort(nums);
        System.out.println(nums);

        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                return 1;
                else
                return -1;
            }
        };

        Collections.sort(nums, com);

        List<Stud> students = new ArrayList<>();
        students.add(new Stud(20,"Avinash"));
        students.add(new Stud(15, "Jatin"));
        students.add(new Stud(15, "Manas"));
        students.add(new Stud(18, "Deepanshu"));
        Comparator<Stud> com2 = new Comparator<>()
        {
            public int compare(Stud i, Stud j)
            {
                 if(i.age>j.age)
                 return 1;
                 else
                 return -1;
            }
        };
        //or
        Comparator<Stud> com3 = (i,j) -> i.age>j.age? 1 : -1;
        Collections.sort(students,com2);
        System.out.println(students);
        Collections.sort(students,com3);
    }
}

class Stud //implements Comparable<Stud> //if we want to make this class to overrise here itself
{
    int  age;
    String name;
    public Stud(int age, String name)
    {
        this.name = name;
        this.age = age;
    }
    public String toString()
    {
        return "Student [age = "+age+", name = "+name+"]";
    }
    // @Override
    // public int compareTo(Stud that) 
    // {
    //     if(this.age>that.age)
    //     return 1;
    //     else
    //     return -1;
    // }
}
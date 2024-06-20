public class ObjectArray
{
    public static void main(String args[])
    {
        Student S1 = new Student();
        S1.rollno = 1;
        S1.name = "Avinash";
        S1.marks = 90;

        Student S2 = new Student();
        S2.rollno = 2;
        S2.name = "Jatin";
        S2.marks = 95;

        Student S3 = new Student();
        S3.rollno = 3;
        S3.name = "Manas";
        S3.marks = 100;

        Student students[] = new Student[3]; 
        students[0] = S1;
        students[1] = S2;
        students[2] = S3;

        for(Student stud : students)
        {
            System.out.println(stud.name +" : "+ stud.marks);
        }
    }
}

class Student
{
    int rollno;
    String name;
    int marks;
}
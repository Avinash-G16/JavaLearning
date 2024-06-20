public class AssignmentOp {
    public static void main(String args[]) {
        int num1 = 7;
        int num2 = 5;
        int result = num1 % num2;
        System.out.println(result); //2
        // increment ops
        int num = 10;
        num = num + 2;
        num += 2;
        System.out.println(num); //14
        num -= 2;
        System.out.println(num); //12
        num *= 8;
        System.out.println(num); //96
        num++; // post increment
        System.out.println(num); //97
        ++num; // pre increment
        System.out.println(num); //98
        --num; // pre decrement
        System.out.println(num); //97
        num--; // post decrement
        System.out.println(num); //96
        int result1 = num++;
        System.out.println(result1); //96
        int result2 = ++num;
        System.out.println(result2); //98
    }
}
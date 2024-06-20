public class ObjectClass {
    public static void main(String args[]) {
        int num1 = 4, num2 = 5;
        int result = num1 + num2;
        System.out.println(result); //9

        Calculator obj/*reference variable*/ = new Calculator()/*obj created */;
        int res = obj.add(num1,num2);
        System.out.println(res); //9
    }
}

class Calculator {
    int a; //instance variable

    public int add(int x, int y) {
        System.out.println("I am in add");
        return x + y;
    }
}
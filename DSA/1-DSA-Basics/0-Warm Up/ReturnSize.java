import java.util.Scanner;
public class ReturnSize
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String check = sc.nextLine();
        switch(check)
        {
            case "Integer":
                System.out.println(4);
                break;
            case "Float":
                System.out.println(4);
                break;
            case "Double":
                System.out.println(8);
                break;
            case "Character":
                System.out.println(1);
                break;
            case "Byte":
                System.out.println(1);
                break;
            default:
                System.out.println("Not valid input");
        }
        sc.close();
    }
}
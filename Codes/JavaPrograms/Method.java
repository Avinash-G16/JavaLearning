public class Method {
    public static void main(String args[]) {
        Computer obj = new Computer();
        obj.Music();
        String pen = obj.Pen(12);
        System.out.println(pen);
    }
}

class Computer {
  
    public void Music()
    {
        System.out.println("Playing music");
    }
    public String Pen(int cost)
    {
        if(cost>=10)
        {
            return "Pen";
        }
        else
        {
            return "Nothing";
        }
    }
}
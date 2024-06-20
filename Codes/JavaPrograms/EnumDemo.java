public class EnumDemo
{
    public static void main(String args[])
    {
        int j = 5;
        Status s = Status.Running;
        System.out.println(j+" "+s);
        s = Status.Failed;
        System.out.println(s.ordinal());
        Status[] ss = Status.values();
        for(Status i : ss)
        {
            System.out.println(i+" : "+ i.ordinal());
        }

        Status sss = Status.Pending;
        if(sss==Status.Running)
        {
            System.out.println("running");
        }
        else if(sss==Status.Failed)
        {
            System.out.println("failed");
        }
        else if(sss==Status.Pending)
        {
            System.out.println("pending");
        }
        else
        {
            System.out.println("Success");
        }
        Status ssss = Status.Success;
        switch(ssss)
        {
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            default:
                System.out.println("Done");
                break;
        }
    }
}

enum Status
{
    Running, Failed, Pending, Success;
}
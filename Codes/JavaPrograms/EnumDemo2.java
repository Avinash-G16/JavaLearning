public class EnumDemo2
{
    public static void main(String args[])
    {
        LaptopComp lap = LaptopComp.Macbook;
        System.out.println(lap+" : "+lap.getPrice());

        for(LaptopComp l: LaptopComp.values())
        {
            System.out.println(l+" : "+l.getPrice());
        }
    }
}

enum LaptopComp
{
    Macbook(2000), XPS(2200), Surface, Thinkpad(1800);

    private int price;
    private LaptopComp(int price)
    {
        this.price = price;
    }
    private LaptopComp()
    {
        this.price = 500;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
}
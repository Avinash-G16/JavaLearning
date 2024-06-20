public class ObjectClassIllustration
{
    public static void main(String args[])
    {
        Lap o = new Lap();
        o.model = "Lenovo";
        o.price = 1000;
        System.out.println(o);//while printing the object, it calls toString() method behind the scenes even if we don't mention it (o == o.toString()) == classname + @ + hashCode to hexstring
    }
}


class Lap
{
    String model;
    int price;
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Lap other = (Lap) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "Lap [model=" + model + ", price=" + price + "]";
    }
}
public class RecordClassDemo
{
    public static void main(String args[])
    {
        Alien a1 = new Alien(20, "Avinash");
        Alien a2 = new Alien(20, "Avinash");
        Alien a3 = new Alien();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a1.equals(a2));
    }
}
// class Alien
// {
//     private int age;
//     private String name;
//     public int getAge() {
//         return age;
//     }
//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + age;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }
//     @Override
//     public String toString() {
//         return "Alien [age=" + age + ", name=" + name + "]";
//     }
//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alien other = (Alien) obj;
//         if (age != other.age)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }
//     public void setAge(int age) {
//         this.age = age;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public Alien(int a, String b)
//     {
//         this.name = b;
//         this.age = a;
//     }

// }


//or

record Alien(int age, String name)
{
    public Alien()
    {
        this(0,"");
    }   
    public Alien //compact canonical constructor
    {
        if(age==0)
            throw new IllegalArgumentException("Cannot be zero");
    }
}
public class Dog {
    private String name;

    public Dog(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public String toString()
    {
        return "Dog : " + name;
    }

    public void bark()
    {
        System.out.println("woof!");
    }
}

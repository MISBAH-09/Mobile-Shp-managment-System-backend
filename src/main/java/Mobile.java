public class Mobile
{
    private int id;
    private String name;
    private static int counter = 0;

    public Mobile(String name)
    {
        this.id = ++counter;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


}

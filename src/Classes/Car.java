package Classes;

public class Car extends Vehicle{
    protected static int carCount = 0;
    protected static final String[] manufacturerName = {"Toyota", "Nissan","Honda", "Hondai"};

    public Car()
    {
        carCount++;
    }

    public String toString()
    {
       return super.toString() + " 2019";
    }

}

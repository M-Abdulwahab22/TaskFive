package Classes;

public class Wheel {

    private int size;
    private static String color;

    public void setSize(int size)
    {
        this.size = size;
    }
    public int getSize()
    {
        return this.size;
    }

    public static void setColor(String color)
    {
        Wheel.color = color;
    }

    public static String getColor()
    {
        return color;
    }



}

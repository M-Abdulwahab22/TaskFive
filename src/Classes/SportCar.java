package Classes;

public class SportCar extends Car{
    private int modelYear;
    private int modelNumber;

    public SportCar()
    {
        this(2025);
    }

    public SportCar(int modelYear)
    {
        this(modelYear,0);
    }

    public SportCar(int modelYear, int modelNumber)
    {
        super();
        this.modelYear = modelYear;
        this.modelNumber = modelNumber;
    }


    public double calculatePrice()
    {
        double basePrice = 2000;

        return basePrice  * 0.20;
    }

    public void describeCar()
    {
        System.out.println("model number : " + modelNumber + ", model year : " + modelYear);

    }

    public boolean equals(SportCar obj)
    {
        if(this.e.getPowerEngine() == obj.e.getPowerEngine() )
        {
            return true;
        }else{
            return false;
        }
    }
}

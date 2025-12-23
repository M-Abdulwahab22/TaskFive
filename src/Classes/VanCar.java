package Classes;

public class VanCar extends Car{
    @Override
    public double calculatePrice() {
        double basePrice = 35000;
        if(e.getPowerEngine() <= 1500)
        {
            double tax = (basePrice + 1000) * 0.14;
            return (basePrice + 1000) + tax;
        }
        else if(e.getPowerEngine() == 2000)
        {
            double tax = (basePrice + 1000) * 0.16;
            return (basePrice + 1500  ) + tax;

        }else{
            double tax = (basePrice + 1000) * 0.16;
            return (basePrice + 2000  ) + tax;

        }
    }
    public void describeCar()
    {
        System.out.println("The price of the car is : " + calculatePrice());

    }
    public boolean equals(VanCar r)
    {
        if(r instanceof VanCar && (this.calculatePrice() == r.calculatePrice()))
        {
            return true;
        }else{
            return false;
        }
    }

}

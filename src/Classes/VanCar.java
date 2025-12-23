package Classes;

public class VanCar extends Car{

    @Override
    public double calculatePrice() {
        double basePrice = 35000;
        if(e.getPowerEngine() <= 1500)
        {
            return (basePrice + 1000) * 0.14;
        }
        else if(e.getPowerEngine() == 2000)
        {
            return (basePrice + 1500  )* 0.16;

        }else{
            return (basePrice + 2000  )* 0.18;

        }
    }
    public void describeCar()
    {
        System.out.println("The price of the car is : " + calculatePrice());

    }

    public boolean equals(VanCar r)
    {
        if(this == r && (this.calculatePrice() == r.calculatePrice()))
        {
            return true;
        }else{
            return false;
        }
    }

}

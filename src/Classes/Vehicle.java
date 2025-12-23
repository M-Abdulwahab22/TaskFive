package Classes;

import Interfaces.PriceAdmin;
import Interfaces.VehicleAdmin;
import q1_b.Seat;

public class Vehicle implements PriceAdmin, VehicleAdmin {
    protected Wheel[] warr = new Wheel[4];
    protected Seat[] sarr = new Seat[5];
    protected Engine e;

    public Vehicle()
    {
        Wheel.setColor("black");

      for(int i = 0; i < warr.length; i++)
      {
          warr[i] = new Wheel();
          warr[i].setSize(18);
      }

       e = new Engine();
    }

    public double calculatePrice()
    {
         return 0.0;

    }

    public void describeCar()
    {

    }

    public String toString()
    {
        return this.getClass().getSimpleName();
    }



}

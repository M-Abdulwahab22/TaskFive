import Classes.Car;
import Classes.SportCar;
import Classes.VanCar;
import Classes.Wheel;

public class Main {
    public static Car[] carArr = new Car[3];

    public static void main(String[] args) {
        System.out.println("Initial number of cars : " + Car.getCarCount());

        carArr[0] = new VanCar();
        carArr[1] = new SportCar();
        carArr[2] = new VanCar();

        System.out.println(carArr[0].toString());

        System.out.println(Wheel.getColor());
        Wheel.setColor("gray");
        System.out.println(Wheel.getColor());

        System.out.println(searchModel("Honda"));

        System.out.println("number of cars : " + Car.getCarCount());


    }

    public static int searchModel(String m)
    {
        String[] mNames = Car.getManufacturerName();
        for (int i =0; i < mNames.length; i++)
        {
            if(mNames[i].equalsIgnoreCase(m)){
                return i;
            }
        }

        return -1;
    }
}
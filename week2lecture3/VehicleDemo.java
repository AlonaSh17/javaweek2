package week2lecture3;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        // присвоение значений полям в обьекте minivan
        minivan.passengers =7;
        minivan.fuelcap =16;
        minivan.mpg =21;

        //расчет дальности поездки с полным баком горючего
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Can deliver " + minivan.passengers + " passengers for distance " + range +" miles");
    }
}

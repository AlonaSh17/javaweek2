package week2lecture3;

public class TwoVehicles3 {
    public static void main(String[] args) {
        Vehicle3 minivan = new Vehicle3();
        Vehicle3 sportcar = new Vehicle3();
        int range1, range2;

        //присвоение значений полям в обьекте минивэн
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        //получение дальности поездки для разных тс
        range1 = minivan.range();
        range2 = sportcar.range();

        System.out.println("Minivan can deliver " + minivan.passengers + " passengers for distance " + range1 + " miles");

        System.out.println("Sportcar can deliver " + sportcar.passengers + " passengers for distance " + range2 + " miles");

    }
    }

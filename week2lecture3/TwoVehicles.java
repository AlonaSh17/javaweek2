package week2lecture3;

public class TwoVehicles {
    public static void main(String[] args) {
        Vehicle minivan =new Vehicle();
        Vehicle sportcar = new Vehicle();
        int range1, range2;

        //присвоение значений полям в обьекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //присвоение значений полям в обьекте sportcar
        sportcar.passengers = 2;
        sportcar.fuelcap =14;
        sportcar.mpg = 12;

        range1 = minivan.fuelcap * minivan.mpg;
        range2 =sportcar.fuelcap *sportcar.mpg;

        System.out.println("Minivan can deliver " + minivan.passengers + " passengers for distance " + range1 +" miles");
        System.out.println("Sportcar can deliver " + sportcar.passengers + " passengers for distance " + range2 +" miles");

    }
}

package week2lecture3;

public class TwoVehicles4 {

    public static void main(String[] args) {
        Vehicle4 minivan = new Vehicle4();
        Vehicle4 sportcar = new Vehicle4();
        double galoons;
        int dist = 252;

        //присвоение значений полям в обьекте минивэн
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        galoons = minivan.fuelNeeded(dist);

        System.out.println("For distance " + dist + "miles it will take " + galoons + "galoons");
        galoons = sportcar.fuelNeeded(dist);
        System.out.println("For distance " + dist + "miles it will take " + galoons + "galoons");
    }
}
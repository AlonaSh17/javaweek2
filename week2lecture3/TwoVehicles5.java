package week2lecture3;

public class TwoVehicles5 {
    public static void main(String[] args) {
        Vehicle5 minivan =new Vehicle5(7,16,21);
        Vehicle5 sportcar = new Vehicle5(2,14,12);
        double gallons;
        int dist =252;
        gallons = minivan.fuelNeeded(dist);
        System.out.println("For distance " + dist + " miles it will take " + gallons + " gallons");
        gallons = sportcar.fuelNeeded(dist);
        System.out.println("For distance " + dist + " miles it will take " + gallons + " gallons");
    }
}

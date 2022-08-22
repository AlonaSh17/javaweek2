package week2lecture3.vehicle;

public class TruckDemo {
    public static void main(String[] args) {
        Truck semi = new Truck(2,200, 7, 44000);
        Truck pickup = new Truck(3,28,15,2000);

        double gallons;
        int dist =252;

        gallons = semi.fuelNeeded(dist);
        System.out.println("Truck can deliver "+semi.getCargocap() + " pounds");
        System.out.println("For distance " +dist + " miles truck needs "+ gallons +" gallons");

        gallons =pickup.fuelNeeded(dist);
        System.out.println("Pickup can deliver "+pickup.getCargocap() +  "pounds");
        System.out.println("For distance " +dist + " miles pickup needs "+ gallons +" gallons");
    }
}



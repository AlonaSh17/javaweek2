package week2lecture3.vehicle;

public class OffRoad extends Vehicle {
    private int groundClearance;

    OffRoad(int p, int f, int m, int gc) {
        super(p,f,m);
        groundClearance = gc;
    }

    public int getGroundClearance() {
        return groundClearance;
    }

    public void setGroundClearance(int groundClearance) {
        this.groundClearance = groundClearance;
    }
}

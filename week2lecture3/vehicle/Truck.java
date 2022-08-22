package week2lecture3.vehicle;

public class Truck extends Vehicle {
    private int cargocap; //грузоподьемность в фунтах

    //конструктор
    Truck(int p, int f, int m, int c) {
        //инициализация членов класса с использованием конструктора этого класса
        super(p,f,m);
        cargocap = c;
    }
    //методы доступа к переменной cargocap


    public int getCargocap() {
        return cargocap;
    }

    public void setCargocap(int cargocap) {
        this.cargocap = cargocap;
    }
}

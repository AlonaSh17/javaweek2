package week2lecture3;

public class Vehicle4 {
    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return fuelcap * mpg;

    }

    //расчет количества топлива, необходимого транспортному средству для преодоления расстояния
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}
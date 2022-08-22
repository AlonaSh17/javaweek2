package week2lecture3;

public class Rectangle extends TwoDShape {
    //конструктор по умолчанию
    Rectangle(){
        super();
    }

    //конструктор класса прямоугольник
    Rectangle(double w, double h){
        super(w,h,"rectangle");
    }
    //создание квадрата
    Rectangle(double x){
        super(x, "rectangle");
    }
    //создание одного обьекта на основе другого
    Rectangle(Rectangle ob){
        super(ob);
    }

    boolean isSquare(){
        if (getWidth()==getHeight()) return true;
        return  false;
    }

    double area(){
        return getWidth()*getHeight();
    }
}

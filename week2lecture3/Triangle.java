package week2lecture3;

public class Triangle extends TwoDShape{
    private String style;

    //конструктор по умолчанию
    Triangle(){
        super();
        style = "none";
    }
    //конструктор класса треугольник
    Triangle(String s, double w, double h){
        super(w,h, "triangle");
        style = s;
    }
    //конструктор с одним аргументом
    Triangle(double x){
        super(x, "triangle");
        style = "painted over";
    }
    //создание одного обьекта на основе другого
    Triangle(Triangle ob){
        super(ob);
        style = ob.style;
    }

    double area(){
        return getWidth() * getHeight() /2;
    }
    void showStyle(){
        System.out.println("Triangle "+ style);
    }

    @java.lang.Override
    public String toString() {
        return "Triangle{" +
                "style='" + style + '\'' +
                '}';
    }
}

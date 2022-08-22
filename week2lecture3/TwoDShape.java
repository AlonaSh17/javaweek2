package week2lecture3;
//Создание абстрактного класса
abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    //Конструктор по умолчанию
    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }
        //Параметризированный конструктор
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

        //Создание обьекта с одинаковыми значениями width & height
        TwoDShape(double x, String n){
            width = height = x;
            name = n;
        }
        //Создание одного обьекта на основе другого
        TwoDShape(TwoDShape ob){
            width = ob.width;
            height = ob.height;
            name = ob.name;
        }
        //Методы доступа к переменным
        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        void showDim(){
            System.out.println("Width and height - "+width+" and "+height);
        }



    abstract double area();

}


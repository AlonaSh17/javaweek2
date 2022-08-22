package week2lecture3;

public class AssessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        //доступ к переменной альфа возможен только с помощью спецаильно предназначенных для этой цели методов
        ob.setAlpha(-99);
        System.out.println("ob.alpha: "+ob.getAlpha());

        //недопустимо
        //  ob.alpha =10;

        ob.beta = 88;
        ob.gamma = 99;
    }
}

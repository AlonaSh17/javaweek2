package week2lecture3;

public class ConsOverloadDemo {
    public static void main(String[] args) {
        ConsOverload c1 = new ConsOverload();
        ConsOverload c2 = new ConsOverload(88);
        ConsOverload c3 = new ConsOverload(17.23);
        ConsOverload c4 = new ConsOverload(2,4);

        System.out.println(c1.x);
        System.out.println(c2.x);
        System.out.println(c3.x);
        System.out.println(c4.x);
    }
}

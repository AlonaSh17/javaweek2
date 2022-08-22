package week2lecture3;

public class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resl;
        double resD;

        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resl = ob.ovlDemo(4,6);
        System.out.println("result of calling ob.ovlDemo(4,6) " +resl);
        System.out.println();

        resD = ob.ovlDemo(1.1,2.32);
        System.out.println("result of calling ob.ovlDemo(1.1,2.32) "+resD);
        System.out.println();
    }
}

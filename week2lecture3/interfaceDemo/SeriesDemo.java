package week2lecture3.interfaceDemo;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwo ob = new ByTwo();

        for (int i=0; i<5; i++)
            System.out.println("Next value: "+ob.getNext());

        System.out.println("Reset\n");
        ob.reset();

        for (int i=0; i<5; i++)
            System.out.println("Next value: "+ob.getNext());

        System.out.println("\nInitial value: 100");
        ob.setStart(100);
        for (int i=0; i<5; i++)
            System.out.println("Next value: "+ ob.getNext());
    }
}

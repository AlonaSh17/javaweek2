package week2lecture3;

public class NestedClassDemo {
    public static void main(String[] args) {
        int x[] = {3,2,1,5,6,7,8};
        Outer outOb = new Outer(x);

        outOb.analyse();
    }
}

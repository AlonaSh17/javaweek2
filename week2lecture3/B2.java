package week2lecture3;

public class B2 extends A {
    int k;

    B2(int a, int b, int c){
        super(a,b);
        k=c;
    }

    @java.lang.Override
    void show() {
        super.show();
        System.out.println("k: "+k);
    }
}

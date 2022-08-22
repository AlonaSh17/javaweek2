package week2lecture3;

import week2lecture3.A;

public class B extends A {
    int k;
    B(int a, int b, int c){
        super(a,b);
        k=c;
    }
    void show(){
        System.out.println("k: "+k);
    }
}

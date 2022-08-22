package week2lecture1hw;

public class  task1 {

    public static void main(String[] args) {

        System.out.println(taskAlona1(333,50));
    }
    public static int taskAlona1(int a,int b) {
        while (a!=b) {
            if (a>b) {
                a=a-b;
            } else {
                b=b-a;
            }
        } return a;

    }

}


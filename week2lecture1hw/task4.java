package week2lecture1hw;

public class task4 {
    public static void main(String[] args) {
        System.out.println(taskAlona4(5));
    }
    public static int taskAlona4(int value) {
        int t=1;
        int result=0;
        for (int j=0; j< value; j++) {
            for (int k=0; k<=j; k++) {
                t *= k+1;
            }
            if (j%2==0) {
                result += t;
            } else {
                result -=t;
            }
            t=1;
        }
        return result;
    }
}

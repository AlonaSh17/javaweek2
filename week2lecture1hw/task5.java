package week2lecture1hw;

public class task5 {
    public static void main(String[] args) {
        System.out.println(taskAlona5());
    }
    public static int taskAlona5() {
        int count =0;
        for (int n = 100000; n<=999999; n++) {
            int n1= n/100000%10;
            int n2=n/10000%10;
            int n3=n/1000%10;
            int n4=n/100%10;
            int n5=n/10%10;
            int n6=n%10;
            if ((n1+n2+n3)==(n4+n5+n6)){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}

package week2lecture1hw;

public class task2 {
    public static void main(String[] args) {
        System.out.println(taskAlona2(66766));
    }
    public static int taskAlona2(int number) {
        int sum = 0;
        while (number>0) {
            sum=sum+number%10;
            number = number/10;
        }
       return sum;
    }
}

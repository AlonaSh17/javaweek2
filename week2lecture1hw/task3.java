package week2lecture1hw;

public class task3 {
    public static void main(String[] args) {
        System.out.println(taskAlona3(13));
    }

    public static boolean taskAlona3(int number) {
        boolean result = false;
        int divider = 2;
        if (number == 2) {
            return result;
        }
        while (number != divider) {
            if (number % divider++ == 0) {
                return false;
            } else {
                result = true;
            }
        }
        return result;

    }
}
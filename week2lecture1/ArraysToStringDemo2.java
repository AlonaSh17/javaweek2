package week2lecture1;

import java.util.Arrays;

public class ArraysToStringDemo2 {
    public static void main(String[] args) {
        int[][] array2D = {{0,1},{2,3}};
        System.out.println(array2D);
        System.out.println(Arrays.toString(array2D));
        System.out.println(Arrays.deepToString(array2D));
    }
}

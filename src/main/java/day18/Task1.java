package day18;

import java.util.Arrays;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {-402, -50, -249, -15, -665, -311};

        System.out.println(recursionSum(numbers));
//        System.out.println(recursionSum(numbers, 0));
    }

    public static int recursionSum(int[] arr) {
        if (0 == arr.length) {
            return 0;
        }
        return arr[arr.length - 1] + recursionSum(Arrays.copyOf(arr, arr.length - 1));
    }
//    public static int recursionSum(int[] numbers, int i) {
//        if (i == numbers.length)
//            return 0;
//
//        return numbers[i] + recursionSum(numbers, i + 1);
//    }
}

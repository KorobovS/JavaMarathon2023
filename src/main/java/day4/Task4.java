package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

//        long after = System.currentTimeMillis();

        Random random = new Random();
        int[] numbers = new int[100];
        int max = 0;
        int index = 0;
        for (int i = 0; i < 100; i++) {
            numbers[i] = random.nextInt(10_000);
            int sum;
            if (i > 1) {
                sum = numbers[i - 2] + numbers[i - 1] + numbers[i];
                if (sum > max) {
                    max = sum;
                    index = i - 2;
                }
            }
        }
//        for (int i = 0; i < 100; i++) {
//            numbers[i] = random.nextInt(10_000);
//        }
//        for (int i = 0; i < 98; i++) {
//            int sum = numbers[i] + numbers[i + 1] + numbers[i + 2];
//            if (sum > max) {
//                max = sum;
//                index = i;
//            }
//        }
        System.out.println(max);
        System.out.println(index);

//        long before = System.currentTimeMillis();
//        System.out.println(before - after);
    }
}

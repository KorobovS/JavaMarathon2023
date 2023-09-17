package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = random.nextInt(10_000);
        }

        int max = 0;
        int min = 10_000;
        int end0 = 0;
        int sumEnd0 = 0;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            if (number % 10 == 0) {
                end0++;
            }
            if (number % 10 == 0) {
                sumEnd0 += number;
            }
        }

        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + end0);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sumEnd0);
    }
}

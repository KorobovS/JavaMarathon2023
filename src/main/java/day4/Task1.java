package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        int big8 = 0;
        int num1 = 0;
        int chet = 0;
        int nechet = 0;
        int sum = 0;

        for (int number : numbers) {
            System.out.print(number + " ");
            if (number > 8) {
                big8++;
            }
            if (number == 1) {
                num1++;
            }
            if (number % 2 == 0) {
                chet++;
            } else {
                nechet++;
            }
            sum += number;
        }

        System.out.println();
        System.out.println("Длина массива: " + numbers.length);
        System.out.println("Количество чисел больше 8: " + big8);
        System.out.println("Количество чисел равных 1: " + num1);
        System.out.println("Количество четных чисел: " + chet);
        System.out.println("Количество нечетных чисел: " + nechet);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}

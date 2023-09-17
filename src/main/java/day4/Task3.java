package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] numbers = new int[12][8];

        int sumStr = 0;
        int x = 0;
        for (int i = 0; i < 12; i++) {
            int sum = 0;
            for (int j = 0; j < 8; j++) {
                numbers[i][j] = random.nextInt(50);
                sum += numbers[i][j];
            }
            if (sum > sumStr) {
                sumStr = sum;
                x = i;
            }
        }
        System.out.println("Ответ: " + x);
    }
}

package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1.printSumDigits(new File("src/main/java/day14/text.txt"));
    }

    public static void printSumDigits(File file) {
        int sum = 0;
        int n = 1;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                n++;
            }
            if (n != 10) {
                throw new RuntimeException();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (RuntimeException e) {
            System.out.println("Некорректный входной файл");
        }
        System.out.println(sum);
    }
}

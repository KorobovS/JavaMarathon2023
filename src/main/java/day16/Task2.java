package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("src/main/java/day16/file1.txt");
        File file2 = new File("src/main/java/day16/file2.txt");
        try {
            PrintWriter pw1 = new PrintWriter(file1);
            PrintWriter pw2 = new PrintWriter(file2);
            Random random = new Random();
            int sum = 0;
            for (int i = 1; i < 1001; i++) {
                int number = random.nextInt(101);
                pw1.println(number);
                sum += number;
                if (i % 20 == 0) {
                    pw2.println((double) sum / 20);
                    sum = 0;
                }
            }
            pw2.close();
            pw1.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Task2.printResult(file2);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            double sum = 0;
            while (scanner.hasNext()) {
                sum += Double.parseDouble(scanner.next());
            }
            scanner.close();
            System.out.println((int) sum / 50);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

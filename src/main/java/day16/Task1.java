package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/java/day14/text.txt");
        Task1.printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            int sum = 0;
            int index = 0;
            while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                index++;
            }
            System.out.printf("%s --> %.3f", (double) sum / index, (double) sum / index);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

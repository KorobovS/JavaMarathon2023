package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File fileRead = new File("src/main/resources/shoes.csv");
        File fileWrite = new File("src/main/resources/missing_shoes.txt");

        try {
            Scanner scanner = new Scanner(fileRead);
            PrintWriter file = new PrintWriter(fileWrite);
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(";");
                if (Integer.parseInt(data[2]) == 0) {
                    file.println(data[0] + ", " + data[1] + ", " + data[2]);
                }
            }
            file.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

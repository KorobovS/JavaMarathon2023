package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(Task2.parseFileToStringList());
    }

    public static List<String> parseFileToStringList() {
        File file = new File("src/main/java/day14/people.txt");
        List<String> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                people.add(str);
                if (Integer.parseInt(str.split(" ")[1]) < 0) {
                    throw new RuntimeException();
                }
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (RuntimeException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}

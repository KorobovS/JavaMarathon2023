package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int year;

    public Person(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", year=" + year + "}";
    }

    public static List<Person> parseFileToObjList() {
        List<Person> person = new ArrayList<>();
        File file = new File("src/main/java/day14/people.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(" ");
                person.add(new Person(data[0], Integer.parseInt(data[1])));
                if (Integer.parseInt(data[1]) < 0) {
                    throw new RuntimeException("Некорректный входной файл");
                }

            }
            return person;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return null;
    }
}

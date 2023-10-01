package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> avtos = new ArrayList<>();

        avtos.add("Lada");
        avtos.add("Moscvich");
        avtos.add("Audi");
        avtos.add("Opel");
        avtos.add("Bmv");

        System.out.println(avtos);

        avtos.add(2, "Gaz");
        avtos.remove(0);

        System.out.println(avtos);
    }
}

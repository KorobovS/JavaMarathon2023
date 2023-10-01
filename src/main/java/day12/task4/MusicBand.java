package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        if (musicBand1 == null) {
            System.out.println("Список участников группы 1 пуст");
        } else if (musicBand2 == null) {
            System.out.println("Список участников группы 2 пуст");
        } else {
            List<String> array = musicBand1.getMembers();
            for (int i = 0; i < array.size(); i++) {
                musicBand2.add(array.get(i));
            }
            for (int i = musicBand1.getMembers().size() - 1; i >= 0; i--) {
                musicBand1.remove(i);
            }
        }
    }

    public void printMembers() {
        System.out.println(members);
    }

    public List<String> getMembers() {
        return members;
    }

    public void add(String name) {
        this.members.add(name);
    }

    public void remove(int i) {
        this.members.remove(i);
    }

    public int getYear() {
        return year;
    }

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
        this.members = new ArrayList<>();
    }

    public MusicBand(String name, int year, ArrayList<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }
}

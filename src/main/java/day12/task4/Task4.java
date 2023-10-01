package day12.task4;

public class Task4 {
    public static void main(String[] args) {
        MusicBand musicBand = new MusicBand("The Beatles", 1960);
        musicBand.add("Джон Леннон");
        musicBand.add("Пол Маккартни");
        musicBand.add("Джон Харрисон");
        musicBand.add("Ринго Старр");

        System.out.println(musicBand);

        musicBand.remove(3);

        System.out.println(musicBand);

        MusicBand musicBand2 = new MusicBand("AC/DC", 1973);
        musicBand2.add("Братья Малькольм");
        musicBand2.add("Ангус Янгами");

        System.out.println(musicBand2);

        MusicBand.transferMembers(musicBand, musicBand2);

        musicBand.printMembers();
        musicBand2.printMembers();
        System.out.println(musicBand.getMembers().size());
        System.out.println(musicBand2.getMembers().size());
    }
}

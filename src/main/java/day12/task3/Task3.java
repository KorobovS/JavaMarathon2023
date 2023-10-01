package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("The Beatles", 1960);
        MusicBand musicBand2 = new MusicBand("Майкл Джексон", 1964);
        MusicBand musicBand3 = new MusicBand("Элвис Пресли", 1954);
        MusicBand musicBand4 = new MusicBand("Мадонна", 1979);
        MusicBand musicBand5 = new MusicBand("Элтон Джон", 1964);
        MusicBand musicBand6 = new MusicBand("Рианна", 2005);
        MusicBand musicBand7 = new MusicBand("Led Zeppelin", 1979);
        MusicBand musicBand8 = new MusicBand("Pink Floyd", 1965);
        MusicBand musicBand9 = new MusicBand("Eminem", 1996);
        MusicBand musicBand10 = new MusicBand("Тейлор Свифт", 2006);

        List<MusicBand> allBands = new ArrayList<>();
        allBands.add(musicBand1);
        allBands.add(musicBand2);
        allBands.add(musicBand3);
        allBands.add(musicBand4);
        allBands.add(musicBand5);
        allBands.add(musicBand6);
        allBands.add(musicBand7);
        allBands.add(musicBand8);
        allBands.add(musicBand9);
        allBands.add(musicBand10);

        System.out.println(allBands);

        Collections.shuffle(allBands);

        System.out.println(allBands);

        System.out.println(groupsAfter2000(allBands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> newBands = new ArrayList<>();
        for (MusicBand band: bands) {
            if (band.getYear() > 2000) {
                newBands.add(band);
            }
        }
        return newBands;
    }
}

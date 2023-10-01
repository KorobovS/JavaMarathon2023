package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> artists;

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        List<MusicArtist> array = musicBand1.getArtists();
        for (int i = 0; i < array.size(); i++) {
            musicBand2.add(array.get(i));
        }
        for (int i = musicBand1.getArtists().size() - 1; i >= 0; i--) {
            musicBand1.remove(i);
        }
    }

    public void remove(int i) {
        artists.remove(i);
    }

    public void add(MusicArtist artist) {
        artists.add(artist);
    }

    public List<MusicArtist> getArtists() {
        return artists;
    }

    public void printMembers() {
        System.out.println(artists);
    }

    public MusicBand(String name, int year, List<MusicArtist> artists) {
        this.name = name;
        this.year = year;
        this.artists = artists;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", artists=" + artists +
                '}';
    }
}

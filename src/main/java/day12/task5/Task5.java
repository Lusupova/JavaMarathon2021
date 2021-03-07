package day12.task5;
import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> musicArtists1 = new ArrayList<>();
        musicArtists1.add(new MusicArtist("Ivan Petrov", 50));
        musicArtists1.add(new MusicArtist("Petr Ivanov", 19));

        List<MusicArtist> musicArtists2 = new ArrayList<>();
        musicArtists2.add(new MusicArtist("Irina Ivanova", 30));
        musicArtists2.add(new MusicArtist("Semen sidorov", 33));


        MusicBand bA = new MusicBand("Prodigy", 1995, musicArtists1);
        MusicBand bB = new MusicBand("Korn", 2000, musicArtists2);

        MusicBand.transferMembers(bA, bB);

        bB.printMembers();
        bA.printMembers();
    }
}

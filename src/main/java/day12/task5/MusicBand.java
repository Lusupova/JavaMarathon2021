package day12.task5;
import java.util.ArrayList;
import java.util.List;

public class MusicBand {

    private String name;
    private int foundationYear;
    private List<MusicArtist> musicArtists;

    public MusicBand(String name, int foundationYear, List<MusicArtist> musicArtists) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.musicArtists = musicArtists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void transferMembers(MusicBand musicBandA, MusicBand musicBandB){
        musicBandB.getMembers().addAll(musicBandA.getMembers());
        musicBandA.clearMembers();

    }
    public void clearMembers(){
        this.musicArtists = new ArrayList<>();
    }

    public void printMembers() {
        for (int i = 0; i < musicArtists.size(); i++) {
            System.out.println(musicArtists.get(i).getName() + " " + musicArtists.get(i).getAge());
        }
    }

    public List<MusicArtist> getMembers(){
        for (int i = 0; i < musicArtists.size(); i++) {
           musicArtists.get(i);
        }
        return musicArtists;
    }
}

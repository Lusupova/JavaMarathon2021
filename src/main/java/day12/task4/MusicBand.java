package day12.task4;
import java.util.ArrayList;
import java.util.List;

public class MusicBand {

    private String name;
    private int foundationYear;
    private List<String> members;

    public MusicBand(String name, int foundationYear, List<String> members) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.members = members;
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
        this.members = new ArrayList<>();
    }

    public void printMembers() {
        for (int i = 0; i < members.size(); i++) {
            System.out.println(members.get(i));
        }
    }

    public List<String> getMembers(){
        return members;
    }
}

package day12.task4;


import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> members1 = new ArrayList<>();
        members1.add("Ivan Petrov");

        List<String> members2 = new ArrayList<>();
        members2.add("Ivan Petrov1");
        members2.add("Irina Ivanova2");

        MusicBand bA = new MusicBand("Prodigy", 1995, members1);
        MusicBand bB = new MusicBand("Korn", 2000, members2);

        MusicBand.transferMembers(bA, bB);

        bB.printMembers();
        bA.printMembers();

    }
}

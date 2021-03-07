package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        MusicBand b1 = new MusicBand("Prodigy", 1995);
        MusicBand b2 = new MusicBand("Korn", 2000);
        MusicBand b3 = new MusicBand("AC/DC", 1999);
        MusicBand b4 = new MusicBand("Metallica", 1990);
        MusicBand b5 = new MusicBand("HIM", 2020);
        MusicBand b6 = new MusicBand("Hard Kiss", 2015);
        MusicBand b7 = new MusicBand("Rammstain", 2001);
        MusicBand b8 = new MusicBand("RHCP", 2020);
        MusicBand b9 = new MusicBand("Tatu", 1998);
        MusicBand b10 = new MusicBand("Mozgi", 1991);
        MusicBand b11 = new MusicBand("Enigma", 1994);

        List<MusicBand> allBands = Arrays.asList(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11);
        Collections.shuffle(allBands);
        System.out.println("Исходный список групп");
        showList(allBands);
        System.out.println("Список групп основанных после 2000");
        showList(groupsAfter2000(allBands));
    }

    public static List<MusicBand> showList(List<MusicBand> bands) {
        List<MusicBand> showList = new ArrayList<>();
        for (MusicBand mb : bands) {
            System.out.println(mb.toString());
        }
        return showList;
    }


    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (int i = 0; i < bands.size(); i++) {
            if (bands.get(i).getFoundationYear() > 2000) {
                groupsAfter2000.add(bands.get(i));
            }
        }
        return groupsAfter2000;
    }
}


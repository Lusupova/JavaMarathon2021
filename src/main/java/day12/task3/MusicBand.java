package day12.task3;

public class MusicBand {

    private String name;
    private int foundationYear;

    public MusicBand(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public String toString(){
        return this.getName() + " " + this.getFoundationYear();
    }
}

package day11.task2;

public class Paladin extends Hero implements Healer {

    public Paladin() {

        this.physAtt = 15;
        this.physDef = 0.5;
        this.magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        this.health = (Math.min(100, this.health + 25));
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(Math.min(100, hero.getHealth() + 10));
    }

    @Override
    public String toString() {
        return "Paladin health: " + health;
    }
}

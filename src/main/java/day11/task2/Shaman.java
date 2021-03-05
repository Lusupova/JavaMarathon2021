package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack {

    public Shaman() {
        this.health = 100;
        this.physAtt = 10;
        this.magicAtt = 15;
        this.physDef = 0.2;
        this.magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        this.health = (Math.min(100, this.health + 50));
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(Math.min(100, hero.getHealth() + 30));
    }

    public void magicalAttack(Hero hero) {
        double health = hero.getHealth() - (this.magicAtt - this.magicAtt * hero.getMagicDef());
        hero.setHealth(Math.max(0, health));
    }

    @Override
    public String toString() {
        return "Shaman health: " + health;
    }
}

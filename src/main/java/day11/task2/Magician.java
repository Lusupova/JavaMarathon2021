package day11.task2;

public class Magician extends Hero implements MagicAttack {

    public Magician() {

        this.physAtt = 5;
        this.magicAtt = 20;
        this.magicDef = 0.8;
        this.physDef = 0.0;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double health = hero.getHealth() - (this.magicAtt - this.magicAtt * hero.getMagicDef());
        hero.setHealth(Math.max(0, health));
    }

    @Override
    public String toString() {
        return "Magician health: " + health;
    }
}

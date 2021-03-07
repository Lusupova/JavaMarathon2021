package day11.task2;

public class Warrior extends Hero implements MagicAttack {

    public Warrior() {
       
        this.physAtt = 30;
        this.magicDef = 0.0;
        this.physDef = 0.8;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double health = hero.getHealth() - (this.magicAtt - this.magicAtt * hero.getMagicDef());
        hero.setHealth(Math.max(0, health));
    }

    @Override
    public String toString() {
        return "Warrior health: " + health;
    }
}

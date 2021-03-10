package day11.task2;

public abstract class Hero implements PhysAttack {
    protected double health = 100;
    protected int physAtt;
    protected int magicAtt;
    protected double physDef;
    protected double magicDef;

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public void physicalAttack(Hero hero) {
        double health = hero.getHealth() - (this.physAtt - this.physAtt * hero.getPhysDef());
        hero.setHealth(Math.max(0, health));
    }

    @Override
    public String toString() {
        return "Hero health: " + health;
    }
}

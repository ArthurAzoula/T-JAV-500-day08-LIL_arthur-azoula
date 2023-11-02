package Decorator;

public class StuffDecorator extends Warrior {

    protected Warrior decoratedWarrior;

    @Override
    public int getHp() {
        return decoratedWarrior.getHp();
    }

    @Override
    public int getDmg() {
        return decoratedWarrior.getDmg();
    }
}

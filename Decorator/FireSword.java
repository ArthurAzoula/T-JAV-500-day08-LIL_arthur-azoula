package Decorator;

public class FireSword extends StuffDecorator {

    public FireSword(Warrior decoratedWarrior) {
        System.out.println("I can slice and burn like the wind and the flames.");
        this.decoratedWarrior = decoratedWarrior;
    }

    @Override
    public int getDmg() {
        return decoratedWarrior.getDmg() + 3;
    }

}

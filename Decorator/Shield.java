package Decorator;

public class Shield extends StuffDecorator {

    public Shield(Warrior decoratedWarrior) {
        System.out.println("May this shield protect me against the enemy.");
        this.decoratedWarrior = decoratedWarrior;
    }

    @Override
    public int getHp() {
        return decoratedWarrior.getHp() + 10;
    }

}

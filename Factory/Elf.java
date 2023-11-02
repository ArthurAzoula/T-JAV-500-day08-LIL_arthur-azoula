package Factory;

import java.util.List;

public class Elf {

    private Toy toy;
    private List<GiftPaper> papers;
    private Factory factory;

    public Elf(Factory factory) {
        this.factory = factory;
    }

    public boolean pickToy(String toyName) throws NoSuchToyException {
        if (toy != null) {
            System.out.println("Minute please?! I'm not that fast.");
        }

        try {
            this.toy = factory.create(toyName);
            System.out.println("What a nice one! I would have liked to keep it...");
            return true;
        } catch (NoSuchToyException e) {
            System.out.println("I didn't find any " + toyName + ".");
            return false;
        }

    }

    public boolean pickPapers(int n) {
        this.papers = factory.getPapers(n);
        return true;
    }
}

package Factory;

import java.util.List;

public class Elf {

    private Toy toy;
    private List<GiftPaper> papers;
    private final Factory factory;

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

    public GiftPaper pack() {
        if (this.toy == null) {
            System.out.println("I don't have any toy, but I've some paper!");
            return null;
        }

        if (this.papers == null || this.papers.isEmpty()) {
            System.out.println("Wait... I can't pack it with my shirt.");
            return null;
        }

        GiftPaper paper = this.papers.get(0);
        paper.wrap(this.toy);
        this.papers.remove(0);
        this.toy = null;
        return paper;
    }
}

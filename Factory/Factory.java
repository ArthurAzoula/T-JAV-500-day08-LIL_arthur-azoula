package Factory;

import java.util.List;

public class Factory {

    public Toy create(String toyName) throws NoSuchToyException {
        if (toyName.equals("teddy")) {
            return new TeddyBear();
        } else if (toyName.equals("gameboy")) {
            return new Gameboy();
        } else {
            throw new NoSuchToyException("No such toy: " + toyName + ".");
        }
    }

    public List<GiftPaper> getPapers(int n) {
        // Create a list containing n GiftPaper objects
        List<GiftPaper> papers = new java.util.ArrayList<GiftPaper>();

        for (int i = 0; i < n; i++) {
            papers.add(new GiftPaper());
        }

        return papers;
    }
}

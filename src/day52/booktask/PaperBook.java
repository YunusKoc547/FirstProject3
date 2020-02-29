package day52.booktask;

public class PaperBook extends Book {

    int weight;

    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight = weight;
    }


    @Override
    public void displayBookInfo() {
        System.out.println("Paper Book's name is: " + name
                + ", and the author is: " + author
                + ", and it weighs " + weight);
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void takeNotes() {
        System.out.println("Bookmark and Taking notes from " + name);
    }

}

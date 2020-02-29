package day52.booktask;

public class AudioBook extends Book{

    double duration;

    public AudioBook(String name, String author, double duration) {
        super(name, author);
        this.duration = duration;
    }

    public void listen() {
        System.out.println("listening to audio book " + name + " by " + author);
    }

    @Override
    public void displayBookInfo() {

    }

    @Override
    public void takeNotes() {
        System.out.println("Taking notes on the digital book by " +
                "writing the provided digital table");
    }

    @Override
    public void showTableOfContents() {
        System.out.println("If you want to see Table of Contents of " + name + " by " + author + " press ...");
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

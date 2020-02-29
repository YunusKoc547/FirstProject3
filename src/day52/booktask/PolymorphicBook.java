package day52.booktask;

public class PolymorphicBook {

    public static void main(String[] args) {

        // We can refer the paper book object using
        // ----- it's own type : PaperBook;
        // ----- or it's super type : Book, Readable,
        Book b1 = new PaperBook("Java","Akbar",3);
        b1.displayBookInfo();
        // this is a very similar idea as putting the small coffee cup into a grande cup
        KnowledgeBank kb = b1;
        kb.takeNotes();
        kb.showTableOfContents();

        Book b2 = new PaperBook("Selenium","Vasyl",2);
        Book b3 = new AudioBook("Agile","Guljannat",1.8);
        Book b4 = new PaperBook("The Kite Runner","Khaled Hosseini",3);
        Book b5 = new PaperBook("Lord of the Rings","J. R. R. Tolkien",2000);
        Book b6 = new AudioBook("Game of Thrones","George R. R. Martin",95.5);

        b6.showTableOfContents();
        b6.displayBookInfo();

    }
}

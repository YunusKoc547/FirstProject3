package day52.booktask;

public interface KnowledgeBank{

      public abstract void takeNotes();

      public default void showTableOfContents() {
          System.out.println("Chapter 1 until Chapter 10 : you do the rest");
      }

}

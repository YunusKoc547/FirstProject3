package replpractice;

public class Book {

    String title;
    String author;
    String tableOfContents ="";
    int nextPage =1;

    Book(String title, String author ){
        this.title = title;
        this.author=author;
    }

    public void addChapter (String title, int pageNum){
        tableOfContents+= "\n" +title+"..."+nextPage;
        nextPage+=pageNum;
    }
    public int getPages(){
        return nextPage-1;
    }
    public String getTableOfContents(){
        return tableOfContents;
    }

    public String toString(){
        return title+ " \n "+author;

    }
}

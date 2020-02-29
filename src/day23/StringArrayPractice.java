package day23;

public class StringArrayPractice {

    public static void main(String[] args) {

        String[] shows = {  "Orville",
                            "Gifted",
                            "Game of Thrones",
                            "Flash",
                            "Arrow",
                            "Super girl"};
        
        String myFavoriteShow = shows[0];
        System.out.println("myFavoriteShow = " + myFavoriteShow + " my favorite show's character count is : " + myFavoriteShow.length());



        System.out.println("shows Count = " + shows.length);

        for (int x = 0; x < shows.length; x++) {

            System.out.println(shows[x] + " has a character count of " + shows[x].length());

        }
    }
}

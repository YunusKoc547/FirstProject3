package day43;

import day42.Movie;

// this class has a lot of static methods to deal with movie object
public class MovieActions {

    public static void main(String[] args) {

        Movie m1 = new Movie("Joker",2.5,"Drama");

//         data type mismatch
//         int x = "joker";         // x is a container, it can store a number
//         Scanner scan = "Joker";  // scan is a container, it can store address of any scanner object
//         Movie m2 = "Joker";      // m2 is a container, it can store address of any movie object
        printMovieInformation(m1);

        Movie m2 = new Movie("Cinderella",1.5,"Family");
        printMovieInformation(m2);
        printShorterDurationMovieName(m1,m2);
        Movie result = getJokerMovie();
        System.out.println("Name is " + result.getName());
        System.out.println("is Joker longer than 2 hours : " + isMovieLengthMoreThan2Hours(m1));
    }

    public static void printMovieInformation(Movie movieObj) {
        System.out.println("The movie name " + movieObj.getName());
        System.out.println(" is " + movieObj.getLength() + "hours long");
        System.out.println(" and the genre is " + movieObj.getGenre());
    }

    // create a static method that return with name Joker movie object with 2.5 hour and type Drama
    public static Movie getJokerMovie() {
        Movie j = new Movie("Joker",2.5,"Drama");
        return j;
    }

    public static void printShorterDurationMovieName(Movie movieObj1, Movie movieObj2) {

        if (movieObj1.getLength() < movieObj2.getLength()) {
            System.out.println(movieObj1.getName());
        }else {
            System.out.println(movieObj2.getName());
        }
    }

    public static boolean isMovieLengthMoreThan2Hours(Movie movieObj) {
        if (movieObj.getLength() > 2) {
            return true;
        }else {
            return false;
        }
    }
}

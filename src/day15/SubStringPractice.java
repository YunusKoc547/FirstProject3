package day15;

public class SubStringPractice {

    public static void main(String[] args) {


        // getting the part of the String out of another String
        //
        //              01234567890123456
        String movie = "Lord of the Rings";

        String wordOf = movie.substring(5, 7);
        System.out.println("wordOf = " + wordOf);
        // I want to get the word <Of> from this movie

        String wordThe = movie.substring(8, 11);
        System.out.println("wordThe = " + wordThe);

        //String movie = "Lord Of The Rings"
        int startingPoint = movie.indexOf(" ") + 1;
        int endingPoint = movie.length();

        System.out.println("second word till last :" + movie.substring(startingPoint,endingPoint));

        String secondWordTillLast = movie.substring(5, 16);
        System.out.println("second Word Till Last = " + secondWordTillLast);

        String wordLordOf = movie.substring(0,7);
        System.out.println(wordLordOf);

        // If you want to start from somewhere and just get the rest of the String
        // above method will work, however there is even better method
        // if you provide only one parameter to substring method
        // it will just start from that location and continue until the end
        String secondToLast = movie.substring(5);
        System.out.println(secondToLast);

        // with this in mind: TASK
        //                01234567890123456
        //String movie = "Lord Of The Rings"
        // Turn lord of the rings -->> Rings Of The Lord

        System.out.println(movie.substring(12,17) + movie.substring(4,7) + movie.substring(7,12) + movie.substring(0,4));

    }
}

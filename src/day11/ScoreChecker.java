package day11;

public class ScoreChecker {

    public static void main(String[] args) {

        int score = 60;

        if (score < 0 || score > 100) {
            System.out.println("INVALID SCORE");
        }
        else if (score == 100) {
            System.out.println("PERFECT SCORE");
        }
        else if (score > 70 && score < 100) {
            System.out.println("YOU HAVE PASSED");
        }
        else if (score > 40 && score < 70) {
            System.out.println("A little bit more studying and you will pass");
        }
        else if (score > 30 && score < 40) {
            System.out.println("Attend additional classes");
        }
        else if (score < 20) {
            System.out.println("Come to my office");
        }
        else {
            System.out.println("You have failed");
        }
        System.out.println("The End");






























    }
}

package day12;

public class CheckingStringEqualityWithoutCaseTask {

    public static void main(String[] args) {

        // store your name into a variable
        // check for equality using different uppercase or lowercase example
        // using equals and equalsIgnoreCase

        String name = "Yunus";
        boolean isNameCorrect = name.equals("YUNUS");
        System.out.println(isNameCorrect);

        boolean isNameCorrect2 = name.equalsIgnoreCase("YUNUS");
        System.out.println(isNameCorrect2);
    }

}

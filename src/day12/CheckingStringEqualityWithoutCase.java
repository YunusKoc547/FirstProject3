package day12;

public class CheckingStringEqualityWithoutCase {

    public static void main(String[] args) {


        String userName = "abc123" ;

       boolean isUserNameCorrect = userName.equals("ABC123");

        System.out.println( isUserNameCorrect);

        boolean isUserNameCorrect2 = userName.equalsIgnoreCase("ABC123");

        System.out.println(isUserNameCorrect2);



    }
}

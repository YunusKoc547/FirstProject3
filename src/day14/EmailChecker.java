package day14;

public class EmailChecker {

    public static void main(String[] args) {

        String email = "hi@gmail.com";

        boolean containsAtCharacter = !email.contains("@");
        boolean containsSpace = email.contains(" ");


        if (containsAtCharacter || containsSpace)  {
            System.out.println("INVALID EMAIL");
        }else if (email.endsWith("@gmail.com")) {
            System.out.println("google mail");
        }else if (email.endsWith("@yahoo.com")) {
            System.out.println("yahoo email");
        }else if (email.endsWith("@mail.ru")) {
            System.out.println("russian mail");
        }else {
            System.out.println("INVALID EMAIL, UNKNOWN DOMAIN");
        }
    }
}

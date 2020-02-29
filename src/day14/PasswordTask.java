package day14;

public class PasswordTask {

    public static void main(String[] args) {

        // PASSWORD VALIDATOR

        // MINIMUM 8 CHAR MAXIMUM 16 CHAR
        // IT MUST CONTAIN _ OR $
        // IT CANNOT CONTAIN SPACE
        // IT MUST START WITH Ab

        // if any of the above condition does not match, say INVALID PASSWORD
        // else say GOOD PASSWORD

        String password = " Abskjdh";


        boolean min8max16 =  password.length()>=8 && password.length() <= 16;
        boolean mustContain_or$ = password.contains("_") || password.contains("$");
        boolean mustNotContainSpace = !password.contains(" ");
        boolean mustStartWithAb = password.startsWith("Ab");

        if (min8max16 && mustContain_or$ && mustNotContainSpace && mustStartWithAb) {
            System.out.println("VALID PASSWORD");
        }else {
            System.out.println("INVALID PASSWORD");
        }
    }
}

package day35;

public class WrapperClassMethods {

    public static void main(String[] args) {

        Character charObject = Character.valueOf('a');
        System.out.println("Get Character Object-> Character.valueOf('a') = " + Character.valueOf('a') );
        System.out.println("Character.isDigit('7') = "      + Character.isDigit('7'));
        System.out.println("Character.isLetter('A') = "     + Character.isLetter('A'));
        System.out.println("Character.isLetterOrDigit(' ') = " + Character.isLetterOrDigit(' '));
        System.out.println("Character.isUpperCase('a') = "  + Character.isUpperCase('a'));
        System.out.println("Character.isLowerCase('b') = "  + Character.isLowerCase('b'));
        System.out.println("Character.toUpperCase('a') = "  + Character.toUpperCase('a'));
        System.out.println("Character.toLowerCase('A') = "  + Character.toLowerCase('A'));
        // "A123b3W423cc4523B $$ aa 77J JsG8 2347SDFSJF"
        // Try out above Character methods given to you and try to solve the problem of extracting the number out of the string
    }
}

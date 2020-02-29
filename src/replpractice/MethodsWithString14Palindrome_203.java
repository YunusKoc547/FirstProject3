package replpractice;

public class MethodsWithString14Palindrome_203 {

    public static boolean isPalindrome(String check) {

        check = check.replace(" ", "");
        String reversed = "";
        for (int i = check.length()-1; i >= 0; i--) {
            reversed += check.charAt(i);
        }
        return reversed.equalsIgnoreCase(check);
    }
}

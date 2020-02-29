package replpractice;

public class MethodsWithString11ReverseString_191 {

    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
    }

    public static String reverse(String input) {
        String reverse = "";
        for (int i = input.length()-1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
        return reverse;

    }
}

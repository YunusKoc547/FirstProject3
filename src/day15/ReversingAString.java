package day15;

public class ReversingAString {

    public static void main(String[] args) {

        String name = "Yunus";
        System.out.println(name.charAt(0) + " " + name.charAt(1) + " " + name.charAt(2) + " " + name.charAt(3) + " " + name.charAt(4));

        System.out.println(name.charAt(4) + " " + name.charAt(3) + " " + name.charAt(2) + " " + name.charAt(1) + " " + name.charAt(0));

        // how do you find out last character of any String
        // counting character starts with one
        // counting index (location) starts with 0
        // so last character index/location will always be one less than actual character count

        // Yunus has 5 characters
        // 01234 and last character index is 4 NOT 5    5-1=4

        int nameLength = name.length();
        int lastCharIndex = nameLength -1;
        char lastChar = name.charAt(lastCharIndex);
        System.out.println(lastCharIndex);

        System.out.println("LAST CHAR IS " + lastChar);
        System.out.println("last char in slot " + name.charAt(name.length()-1));
    }
}

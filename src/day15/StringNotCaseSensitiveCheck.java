package day15;

public class StringNotCaseSensitiveCheck {

    public static void main(String[] args) {

        String name = "Yunus Koc";

        System.out.println(name.contains("ko"));

        // I want to check whether this name contains st no matter the case
        // so I want to store the uppercase version of this name then check for ST

        String upperCaseName = name.toUpperCase();
        System.out.println("upperCaseName Contains KO? " + upperCaseName.contains("KO"));

        String lowerCaseName = name.toLowerCase();
        System.out.println("lowerCaseName contains ko? " + lowerCaseName.contains("ko"));

        // This is called method chaining, combining multiple method call
        // make my name all lowercase (String) then check whether it contains lowercase st

        // THIS WORKS BECAUSE THEY ARE BOTH STRINGS
        System.out.println(name.toLowerCase().contains("st"));
       // System.out.println(name.length().toUpperCase()); BAD IDEA!!!
    }
}

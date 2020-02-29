package day14;

public class IndexOfPractice {

    public static void main(String[] args) {


        // indexOf =
        // find out index of another String inside this String
        //             012345678901
        String name = "Game of Java"; // length is 12
        // find out the location of Java
        // find out the location of letter 0
        // find out the location of first space

        System.out.println(name.indexOf("Java"));

        System.out.println(name.indexOf("o"));
        // if the location is not found, we get a negative number
        System.out.println(name.indexOf("O"));

        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.lastIndexOf("Ga"));

        if (name.indexOf("Kawa") > -1) {
            System.out.println("KAWA FOUND");
        }else {
            System.out.println("NO KAWA");
        }

    }
}

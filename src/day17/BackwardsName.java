package day17;

public class BackwardsName {

    public static void main(String[] args) {

        String name = "Yunus Koc";

        int x = name.length()-1;

        while ( x >= 0) {
            System.out.println("index " + x + " : " + name.charAt( x ));
            --x;



        }
    }
}

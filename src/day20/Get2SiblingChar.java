package day20;

public class Get2SiblingChar {

    public static void main(String[] args) {

        // given a String with even number character count
        // print 2 characters in one line
        //
        // for example: Yunus
        /*
        Yu
        un
        nu
        us
         */
        String name = "Yunus";

        int i = 0;
        for (i = 0; i <= name.length()-2; i++) {
            System.out.println(name.substring(i, i+2));

        }

        for (i = 0; i < name.length()-2 ; i++) {
            System.out.println(name.substring(i, i+3));
        }
    }
}

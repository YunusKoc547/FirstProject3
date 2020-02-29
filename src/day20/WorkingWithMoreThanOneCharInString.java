package day20;

public class WorkingWithMoreThanOneCharInString {

    public static void main(String[] args) {

        // given a String with even number character count
        // print 2 characters in one line
        // for example : Gokyuzum
        /*
            Go - 01 (0,2)
            ky - 23 (2,4)
            uz - 45 (4,6)
            um - 67 (6)
         */
        String name = "Yunusk";
//        int charCount = name.length();
//        System.out.println(name.substring(0,2));
//        System.out.println(name.substring(2,4));
//        System.out.println(name.substring(4,6));
//
//        int x = 0;
//
//        System.out.println(name.substring(x, x+2));
//        x = x+2;
//        System.out.println(name.substring(x, x+2));
//        x = x+2;
//        System.out.println(name.substring(x, x+2));
//        x = x+2;

        // my condition is x <= charCount-2

        int x = 0;

        for (x = 0; x <= name.length()-2; x += 2) {
            System.out.println(name.substring(x,x+2));
        }
    }
}

package day16;

public class WhileLoopIntro {

    public static void main(String[] args) {

        // print "Hello World" 5 times

        String world = "Hello World";
        int count = 1;

        while (count <=5) {
            System.out.println("Hello world");
            count++;
        }
        System.out.println("DONE!");


        int number = 10;
        int cnt = 1;
        while (cnt <= number) {
            System.out.println(cnt);
            ++ cnt;
        }
        System.out.println("DONE");
    }
}

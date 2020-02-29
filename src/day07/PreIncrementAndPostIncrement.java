package day07;

public class PreIncrementAndPostIncrement {

    public static void main(String[] args) {

        int apple = 8;

        apple++;  // incrementing by one --> 9

        System.out.println(apple); // printing the increased value --> 9

        //System.out.println( ++apple); // increasing the value and print the value

        // apple++, when ++ comes after the variable
        // it is called post increment
        // it will increase the value
        // BUT it will reflect the increased value next time the variable shows up!!

        System.out.println(apple++); // ---> 9
        System.out.println(apple); // ----> 10

        int score = 50;

        System.out.println(++score); // 51

        System.out.println(score++); // 51 and ready to be 52 next time it shows up

        System.out.println(score); // 52

        System.out.println(--score); // 51

        System.out.println(score--); // 51 ready to be 50

        System.out.println(score); // 50

        System.out.println(score++); // 50 ready to be 51

        System.out.println(score++); // 51 ready to be 52

        System.out.println(--score); // 51

    }
}

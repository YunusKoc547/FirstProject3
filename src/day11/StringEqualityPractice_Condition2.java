package day11;

public class StringEqualityPractice_Condition2 {

    public static void main(String[] args) {

          /*
        check the value of myStr
        if it is Java = correct word
        if it is Cava = pumpkin
        else say NOT JAVA NOR PUMPKIN
         */

          String myStr = "Java";

        if (myStr.equals("Java")) {
            System.out.println("CORRECT WORD!!!");
        }
        else if (myStr.equals("Cava")) {
            System.out.println("PUMPKIN!!");
        }
        else {
            System.out.println("NOT JAVA NOR PUMPKIN!!");
        }
    }
}

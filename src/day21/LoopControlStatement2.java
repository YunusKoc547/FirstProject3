package day21;

public class LoopControlStatement2 {

    public static void main(String[] args) {


        for (int x = 1; x <= 100 ; x++) {

            if (x % 5 != 0) {
                continue;
            }

            System.out.println(x);

        }
    }
}

package day18;

public class EvenNumber_ForLoop {

    public static void main(String[] args) {

        // skip counting by 2
        // starting from 0 to 100

//        for (int x =0; x <= 100;x +=2) {
//            System.out.print(x + " ");
//
//        }

        for (int x = 0; x <=100; x += 3) {
            if (x % 2 == 0) {
                System.out.println(x + " is an even number");
            }
        }
        // THE SHORTCUT FOR GENERATING FOR LOOP IS :fori enter or tab

        for (int i = 0; i < 100 ; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(i + " This is a FIZZ BUZZ NUMBER");
            }

        }
    }
}

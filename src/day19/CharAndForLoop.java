package day19;

public class CharAndForLoop {

    public static void main(String[] args) {

        // each character has it's corresponding ascii value from the ascii table

        int x = 'A';
        char myChar = 'A';

        System.out.println(x);

        System.out.println(myChar);

        // 'A' + 1 -->> 65 + 1 = 66 -->> 66 --> 'B'
        System.out.println(++myChar);
        // 'B' + 1 -->> 66 + 1 = 67 -->> 67 --> 'C'
        System.out.println(++myChar);
        // 'C' + 1 -->> 67 + 1 = 68 -->> 68 --> 'D'
        System.out.println(++myChar);
        // 'D' + 1 -->> 68 + 1 = 69 -->> 69 --> 'E'
        System.out.println(++myChar);

        System.out.println('A' > 'B'); // 65 > 66
        System.out.println('Z' > 'B');

        for (char iChar = 'A'; iChar <= 'Z'; iChar++) {
            System.out.print(iChar + " ");

        }

        System.out.println();
        for (char kChar = 'Z'; kChar >= 'A'; kChar--) {
            System.out.print(kChar + " ");
        }

        // HOMEWORK
        // CREATE AN INTERACTIVE PROGRAM TO ASK USER
        // STARTING CHARACTER AND ENDING CHARACTER
        // THEN PRINT EVERYTHING IN BETWEEN
        // FOR EXAMPLE USER CAN ENTER Z A, OR A K
        // Can we ask user character?? NO!!
        // Ask user for String and pick first character by chatAt(0)


    }
}

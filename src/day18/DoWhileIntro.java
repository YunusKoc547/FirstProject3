package day18;

public class DoWhileIntro {

    public static void main(String[] args) {

        // count from 1 to 5

        // do {
        //     take some action here and repeat it
        //     } while (some condition is true) ;

        int x = 6;

        do {
            System.out.println(x);
            ++x;
        }while (x <= 5);

        // count from 5 to 1
        int y = 5;
        do {
            System.out.println(y);
            --y;
        }while (y>=0);

        // WHILE LOOP VS DO WHILE LOOP
        /*
        WHILE LOOP CHECKS THE CONDITION FIRST THEN ENTERS THE STATEMENT
        DO WHILE LOOP WILL TAKE THE ACTION AT LEAST ONCE THEN CHECK THE CONDITION
         */
    }
}

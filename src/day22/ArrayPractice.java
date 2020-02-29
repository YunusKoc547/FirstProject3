package day22;

public class ArrayPractice {

    public static void main(String[] args) {

        double [] prices = new double[5];

        System.out.println(prices[0]);

        // can NOT print out array variable directly
        // to see what's inside
        System.out.println(prices);

        System.out.println();

        prices [0] = 2.46;
        prices [1] = 12.96;
        prices [2] = 992.1;
        prices [3] = 500;
        prices [4] = 65.123;
        //what happens if I go over the range
        // RUN TIME ERROR!!
        // prices [5] = 165.3;

        System.out.println(prices [0]);
        System.out.println(prices [1]);
        System.out.println(prices [2]);
        System.out.println(prices [3]);
        System.out.println(prices [4]);

        // Create a char array that hold all the letters from your first name
        // and assign values using each characters of your first name

        // then print out each character

        char [] name = new char[9];

        name [0] = 'Y';
        name [1] = 'u';
        name [2] = 'n';
        name [3] = 'u';
        name [4] = 's';
        name [5] = ' ';
        name [6] = 'K';
        name [7] = 'o';
        name [8] = 'c';

        System.out.println(name [0]);
        System.out.println(name [1]);
        System.out.println(name [2]);
        System.out.println(name [3]);
        System.out.println(name [4]);
        System.out.println(name [5]);
        System.out.println(name [6]);
        System.out.println(name [7]);
        System.out.println(name [8]);

        // THIS WILL ACTUALLY PRINT THE CONTENT OF CHAR ARRAY NOT MEMORY ADDRESS
        // AND THIS IS ONLY GOOD FOR CHAR ARRAY. ANYTHING ELSE WILL PRINT MEMORY ADDRESS
        // System.out.println(name); -->> Yunus Koc

        boolean [] yesNo = new boolean[5];

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

        yesNo[0] = true;
        yesNo[1] = false;
        yesNo[2] = true;

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

    }
}

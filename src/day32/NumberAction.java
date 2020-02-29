package day32;

public class NumberAction {

    public static void main(String[] args) {
        numberComparison(5,10);
        stringRepeater("I Love Java",5);
        skipCountBy3From0to50();
        countDownByEvenNumberFrom50to0();
        countDownFromEvenNumberFromXToY(33,2);
        print1toX(10);
    }
    /*
    create static void methods as below

    numberComparison
    this method has 2 parameters called num1 and num2
    if num1 is more than num2 print num1 is more than num2
    if num2 is more than num1 print num2 is more than num1
    if num2 equals num1 print they are equal

    String repeater
    this method has 2 parameters
    String strToRepeat and int repeatingCount
    repeat printing the string as many time as repeatingCount number define

    skipCountBy3From0to50
        create a method that has no parameter
        and skip count by 3 from 0 to 50

    countDownByEvenNumberFrom50to0
        create a method that has no parameter
        and count down by even number from 50 to 0

        print1toX
            create a method that has 1 int parameter called x
            print from 1 to that number in one line
            print an empty line after the print
     */

    public static void numberComparison(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is more than " + num2);
        }else if (num2 > num1) {
            System.out.println(num2 + " is more than " + num1);
        }else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }
    public static void stringRepeater(String strToRepeat, int repeatingCount) {
        for (int i = repeatingCount; i > 0 ; i--) {
            System.out.print(strToRepeat + " ");
        }
        System.out.println();
    }
    public static void skipCountBy3From0to50() {
        for (int i = 0; i <= 50 ; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void countDownByEvenNumberFrom50to0() {
        for (int i = 50; i >= 0 ; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void countDownFromEvenNumberFromXToY(int x,int y) {
        for (int i = x; i >= y ; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void print1toX(int x) {
        for (int i = 1; i <= x ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

package day34;

public class PracticeMethodWithNumbers {

    public static void main(String[] args) {


                    /* Write a method called Build3DigitNumber
                    it has 3 int parameters digit1 digit2 digit3
                    and it will return the 3 digit numbers you have build
                    if any of digit1 digit2 digit3 is not within range of 0-9 then change it to 0

                    for example :
                    Build3DigitNumber(4,3,4) --->>424
                    Build3DigitNumber(0,2,1)--->>21
                    Build3DigitNumber(65,6,9) --->> 69
 */


            // How can i get 376?
            // digit1 + digit2 + digit3 cannot be concatenated because it is a number not a string
            // int number = digit1 + digit2 + digit3;

        int result1 = build3DigitNumber(6,4,0);
        System.out.println("result1 = " + result1);
        
        int result2 = build3DigitNumber(6,14,0);
        System.out.println("result2 = " + result2);
        
        int result3 = build3DigitNumber(16,14,90);
        System.out.println("result3 = " + result3);

        System.out.println("result1+result2 = " + (result1 + result2));
        System.out.println(result1 + result2 + " is result of result1+result2");

        }

        public static int build3DigitNumber(int digit1, int digit2, int digit3) {
        if (digit1 < 0 || digit1 > 9) {
            digit1 = 0;
        }
        if (digit2 < 0 || digit2 > 9) {
            digit2 = 0;
        }
        if (digit3 < 0 || digit3 > 9) {
            digit3 = 0;
        }

        // we want to make sure every digit is already valid before accessing below statement
        // if you come to this point, it should be already valid
        int number = digit1 * 100 + digit2 * 10 + digit3;
        return number;
    }
}

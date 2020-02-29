package day36;

public class MethodPractice {

    public static void main(String[] args) {

        Boolean result1 = checkIfStringHasNumber("hello1");
        System.out.println("result1 = " + result1);

        System.out.println(checkIfStringHasNumber("hello1"));
    }
    /*
    write a static method to accept a String and return Boolean(Yes Uppercase) .
    it should return true if the String contains at least one number.
     */
    public static Boolean checkIfStringHasNumber(String str) {

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if (Character.isDigit(eachChar)) {
                System.out.println("NUMBER FOUND");
                return Boolean.valueOf(true);
            }
        }
        System.out.println("NO NUMBER FOUND");
        return Boolean.valueOf(false);


    }

}

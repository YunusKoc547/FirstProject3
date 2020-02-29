package day31;

public class Voting {

    public static void main(String[] args) {

        checkEligibility(15);
        checkEligibility(23);
        checkEligibility(63);

    }

    // This method has one int parameter names age
    // whoever calling this method, need to provide a number
    // it will set the value of age into that number
    public static void checkEligibility(int age) {
        if (age > 18) {
            System.out.println("You are eligible");
        }else {
            System.out.println("You are not eligible");
        }

    }
}

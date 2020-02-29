package day33;

public class MethodWithReturnPractice {

    public static void main(String[] args) {
        System.out.println(getSumFrom1toX(10));
        System.out.println(build_Got_Email("Yunus","Koc"));

        String fullName = "Susan cure";

//        String part1 = fullName.split(" ")[0];
//        String part2 = fullName.split(" ")[1];

        String[] fullNameSplit = fullName.split(" ");
        
        String herEmail = build_Got_Email(fullNameSplit[0],fullNameSplit[1]);
        System.out.println("herEmail = " + herEmail);

    }
    /*
     * getSumFrom1toX
     * This method should calculate the sum of
     * the number from 1 to the number user passed
     * @param x the final number to be added
     * @return the sum of numbers from 1 to x
     */

    public static int getSumFrom1toX(int x) {
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }
        return sum;
    }

    public static String build_Got_Email(String firstName, String lastName) {
        String email = firstName.charAt(0) + lastName + "@NightWatch.com";
        return email;
    }
}

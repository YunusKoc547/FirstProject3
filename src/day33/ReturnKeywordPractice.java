package day33;

public class ReturnKeywordPractice {

    public static void main(String[] args) {
        System.out.println(calculateAndReturnAge(2019));
        int[] birthYears = {1925,1932,1700,2001,2000,2020};
        for (int i = 0; i < birthYears.length; i++) {
            System.out.println(calculateAndReturnAge(birthYears[i]));
        }
    }

    public static int calculateAndReturnAge(int birthYear) {
        int age = 2020 - birthYear;
        if (birthYear < 1900 || birthYear >= 2020) {
            return 0;
        }
        return age;
    }
}

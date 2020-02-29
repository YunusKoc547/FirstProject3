package day22;

public class CanvasDayModuleLinkGenerator {

    public static void main(String[] args) {

        String baseURL = "https://learn.cybertekschool.com/courses/278/modules";
        String dayMsg = "This will lead you to day ";

//        for (int moduleNumber = 3317; moduleNumber <= 3317+25 ; moduleNumber++) {
//            System.out.println(dayMsg + moduleNumber);

//      3297 is day one module ID
//      get from day 1 until day 22
        for (int day = 1; day <= 22 ; day++) {

            System.out.println(dayMsg + day);

            System.out.println(3297-1 + day);

        }

    }
}

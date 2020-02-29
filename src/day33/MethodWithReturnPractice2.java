package day33;

public class MethodWithReturnPractice2 {

    /*
     * convertNumberToDay
     * This method will take number from 1-7
     * and convert that to actual day in word
     * @param int dayCode to represent day in number
     * @return the day in word in English as String
     *  if the number is valid
     *         if the number is not 1-7 return FUN DAY!
     */

    public static void main(String[] args) {
        System.out.println(getDaysOfTheWeekFromNumber(1));
        int[] allCodes = {5,3,11,4,33};
        for (int i = 0; i < allCodes.length ; i++) {
            String day = getDaysOfTheWeekFromNumber(allCodes[i]);
            System.out.println("day = " + day);
        }
        for (int eachDayCode : allCodes) {

            System.out.println("eachDayCode = " + getDaysOfTheWeekFromNumber(eachDayCode));
        }
    }

    public static String getDaysOfTheWeekFromNumber(int dayCode) {
        String day = "";
        switch (dayCode) {
            case 1 :
                day = "Day is Monday";
                break;
            case 2 :
                day = "Day is Tuesday";
                break;
            case 3 :
                day = "Day is Wednesday";
                break;
            case 4 :
                day = "Day is Thursday";
                break;
            case 5 :
                day = "Day is Friday";
                break;
            case 6 :
                day = "Day is Saturday";
                break;
            case 7 :
                day = "Day is Sunday";
                break;
            default:
                day = "INVALID DAY";
        }
        return day;
    }
}

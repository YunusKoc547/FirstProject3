package day26;

public class SplitPractice {

    public static void main(String[] args) {

        // 2 additional String methods related to array
        // toCharArray(), another is split (bySomething)

        String survey = "Complete B15 online 1 Month Survey";

        char[] surveyChars = survey.toCharArray();

        // using foreach loop
        for(char each : surveyChars){
            System.out.println("each char is : " + each);
        }

        // using for ;pp[
        for (int x = 0; x < surveyChars.length; x++) {
            System.out.println("each char is : " + surveyChars[x]);
        }


        // try while loop for practice
        int x = 0;
        while (x<surveyChars.length) {
            System.out.println("each char is : " + surveyChars[x]);
            x++;
        }
        int y = 0;
        do {
            System.out.println("each char is : " + surveyChars[y]);
            y++;
        }while (y <surveyChars.length);
    }
}

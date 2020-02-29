package day35;

public class Task {

    public static void main(String[] args) {

        char myChar = '7';
        // get int 7
        String myNum = Character.toString(myChar);
        System.out.println("myNum = " + myNum);

        String str = "A34B123C4X";
        
        char[] allChars = str.toCharArray();

        int sum = 0;

        for (char eachChar : allChars) {
            if (Character.isDigit(eachChar)) {
                System.out.println("eachChar = " + eachChar);
                int eachNum = Integer.parseInt(eachChar + "");
                sum = sum + eachNum;
            }
        }
        System.out.println("sum = " + sum);
        
    }
}

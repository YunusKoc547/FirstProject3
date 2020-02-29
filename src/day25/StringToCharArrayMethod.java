package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {

    public static void main(String[] args) {

        String name = "Yunus";

        // how would you store each and every character
        // to an char array from above name
        // without using method we are about to learn
        char[] namesChar = new char[name.length()];

        for (int x = 0; x < namesChar.length ; x++) {
            // take each character of name and fill the array index
            namesChar[x] = name.charAt(x);
        }
        System.out.println("Arrays.toString(namesChar) = " + Arrays.toString(namesChar));
        
        
        char[] namesChars2 = name.toCharArray();
        System.out.println("Arrays.toString(namesChars2) = " + Arrays.toString(namesChars2));
        
        // pick up your own name and turn it into char array
        // and use for each loop to loop over them
        // optionally count how many a you have in your name
        
        char[] nameChars3 = name.toCharArray();
        System.out.println("Arrays.toString(nameChars3) = " + Arrays.toString(nameChars3));

        int uCount = 0;
        for (int x = 0; x < name.length(); x++) {
            nameChars3[x] = name.charAt(x);
            if (name.charAt(x) == 'u') {
                uCount = uCount +1;
            }
        }
        System.out.println(nameChars3);
        System.out.println(uCount);


        int count = 0;
        for (char eachChar : nameChars3) {
            System.out.println("eachChar = " + eachChar);

            if (eachChar == 'u') {
                ++count;
                System.out.println("U FOUND");
            }

        }
        System.out.println("count = " + count);

        System.out.println("Before sorting nameChar3 " + Arrays.toString(nameChars3));
        Arrays.sort(nameChars3);
        System.out.println("After sorting nameChar3 " + Arrays.toString(nameChars3));
    }
}

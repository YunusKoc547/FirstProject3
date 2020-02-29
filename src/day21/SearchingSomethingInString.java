package day21;

public class SearchingSomethingInString {

    public static void main(String[] args) {

        String myName = "Yunus Koc";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount-1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        // Find out index of all the "u's" in cases of insensitive manner
        // I will go through each and every letter of the String -->> for loop
        //          for each character I can use substring (0,1) and so on
        //          going from 0 to last index -->> for loop
        //
        // while I am going through each and every character
        // I will check whether current character I am looking at
        // equals to "u" or "U"
        // if so, I will print the index
        // if not -->> just move on
        // perform this action until I reach last character



        System.out.println("---2 char---");
        for (int x = 0; x <=lastCharIndex-1 ; x++) {

            String current2Char = myName.substring(x, x+2);
            if (current2Char.equalsIgnoreCase("un")) {
                System.out.println("The index of un or Un is " + x);
            }

        }





    }
}

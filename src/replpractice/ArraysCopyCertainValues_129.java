package replpractice;

import java.util.Arrays;

public class ArraysCopyCertainValues_129 {

    public static void main(String[] args) {

        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two", "three", "four"};
        System.out.println(Arrays.toString(getWithE(numbers)));

    }
        public static String[] getWithE(String[] arr) {

            //TODO : YOUR CODE GOES HERE ----------------------
            int count=0;
            for (String eachWord: arr) {
                if (eachWord.contains("e")) {
                    count++;
                }
            }

            int index=0;
            String[] fewValues = new String [count];
            for (String eachWord: arr) {
                if (eachWord.contains("e")) {
                    fewValues[index]=eachWord;
                    index++;
                }
            }


            //YOUR CODE ENDS HERE -----------------------

            return fewValues;











    }
}

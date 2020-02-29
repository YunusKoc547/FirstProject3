package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListParameter {

    public static void main(String[] args) {
        ArrayList<String> nameLst =new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurin");
        printAList(nameLst);

        byte myByte = 17;
        printByte(myByte);
        int myInt = 100;
        String resultLongest = getLongestElement(nameLst);
        System.out.println("resultLongest = " + resultLongest);
        
    }
    
    public static String getLongestElement(List<String> nameLst) {
        String longestName = "";
        for (int i = 0; i < nameLst.size(); i++) {
            String currentName = nameLst.get(i);
            if (currentName.length() >= longestName.length()) {
                longestName = currentName;
            }
        }
        System.out.println("longestName = " + longestName);
        return longestName;
    }
    
    // Create a method that accepts a list List of String as an argument
    // same thing as a method that has a List of String parameter
    // and print out each and every item in the list vertically
    // return nothing

    public static void printByte(byte b) {
        System.out.println("You passed byte value = " + b);
    }

    public static void printAList(ArrayList<String>lst) {

        for (String each : lst) {
            System.out.println("each = " + each);
        }
    }
}

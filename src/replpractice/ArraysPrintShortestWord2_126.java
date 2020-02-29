package replpractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrintShortestWord2_126 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();


        String[] split=str.split(", ");
        int smallestWordLength=split[0].length();
        String smallestWord="";



        for(int i=1;i<split.length;i++){
            if(split[i].length()<smallestWordLength){
                smallestWordLength=split[i].length();
            }
        }
        for(int i=0;i<split.length;i++){
            if(split[i].length()==smallestWordLength){
                smallestWord+=(split[i]+" ");
            }
        }
        String[] splitedSmall=smallestWord.split(" ");
        Arrays.sort(splitedSmall);
        System.out.println(Arrays.toString(splitedSmall));
    }
}

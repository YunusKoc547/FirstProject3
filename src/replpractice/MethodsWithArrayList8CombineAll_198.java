package replpractice;

import java.util.ArrayList;

public class MethodsWithArrayList8CombineAll_198 {

    public static void main(String[] args) {
        


    }

    public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {

        ArrayList<String> combined = new ArrayList<>();
        combined.addAll(wordList1);
        combined.addAll(wordList2);
        return combined;
    }
}

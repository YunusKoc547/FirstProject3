package replpractice;

import java.util.ArrayList;
import java.util.Collections;

public class MethodsWithArrayList9RemoveAll {

    public static void removeAll(ArrayList wordList, String targetWord) {

        while (wordList.contains(targetWord)) {
            wordList.remove(targetWord);
        }

    }
}

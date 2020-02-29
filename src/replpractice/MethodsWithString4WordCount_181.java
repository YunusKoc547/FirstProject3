package replpractice;

public class MethodsWithString4WordCount_181 {

    public static int wordCount(String words) {

        String[] split = words.split(" ");
        int wordCount = 0;
        wordCount = split.length;
        return wordCount;
    }
}

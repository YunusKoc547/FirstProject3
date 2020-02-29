package replpractice;

public class MethodsWithString6LimitStrong_183 {

    public static String limit(String text, int maxLength)
    {
        String newText = "";
        for (int i = 0; i < maxLength; i++) {
            newText = text.substring(0,i + 1);
        }
        return newText;
    }
}

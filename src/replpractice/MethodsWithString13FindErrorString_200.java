package replpractice;

public class MethodsWithString13FindErrorString_200 {

    public static boolean isError(String line)
    {
        if (line.startsWith("error")) {
            return true;
        }else {
            return false;
        }

    }
}

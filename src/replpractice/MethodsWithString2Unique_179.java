package replpractice;

public class MethodsWithString2Unique_179 {

    public static void main(String[] args) {
        //test your code
        System.out.println( uniqueChars("wooden-spoon") ) ;
    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        String uniqueString = "";

        for (int x = 0; x < str.length(); x++) {

            if (!uniqueString.contains(str.substring(x, x + 1))) {

                uniqueString = uniqueString + str.substring(x, x + 1);
            }
        }
        return uniqueString;
    }



}

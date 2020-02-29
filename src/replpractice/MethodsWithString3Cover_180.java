package replpractice;

public class MethodsWithString3Cover_180 {

    public static void main(String[] args) {
        System.out.println(coverString("java methods", "me") ) ; //java [me]thods
    }

    public static String coverString(String main, String coverME) {
            if (main.contains(coverME)) {
                String coverMe2 = "[" + coverME + "]";
                return main.replace(coverME,coverMe2);
            }else {
                return "[" + main + "]";
            }
        }


}

package replpractice;

public class Utils {
    public static String reverseLetters(String word){
        //TODO

        String result = "";
        String letter = "";
        String reverse = "";
        for (int a = 0 ; a < word.length() ; a++){
            if (Character.isLetter(word.charAt(a))){
                letter += word.charAt(a)+"";
            }
        }
        System.out.println("letter = " + letter);

        for (int b = letter.length()-1 ; b >= 0 ; b--){
            reverse += letter.charAt(b)+"";
        }
        System.out.println("reverse = " + reverse);

        for (int i = 0, x = 0 ; i < word.length(); i++){
            if (!Character.isLetter(word.charAt(i))){
                result += word.charAt(i);
            }
            else {
                result += reverse.charAt(x);
                x++;
            }
        }
        return result;
    }
}

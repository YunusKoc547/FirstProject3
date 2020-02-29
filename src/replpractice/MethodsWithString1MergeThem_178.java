package replpractice;

public class MethodsWithString1MergeThem_178 {

    public static String mergeStrings(String one, String two) {

        String result="";
        for(int i=0; i<one.length() || i<two.length(); i++){
            if(i<one.length())
                result+=one.charAt(i);

            if(i<two.length())
                result+=two.charAt(i);

        }
        return result;
    }

}

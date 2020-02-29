package day33;

public class WarmUp {

    public static void main(String[] args) {
        String spelledName = getSpelledName("Serra");
        System.out.println("spelledName = " + spelledName);
        System.out.println(getSpelledName("Zeynep"));
    }

    /*
    getSpelledName
    This method will put dash in between given String
    for example : Akbar -->> A-k-b-a-r
    @param name this is the name parameter
    @return the name has dash in between
     */

    public static String getSpelledName(String name) {
        // creating variable for resulting String
        String result = "";

        for (int x = 0; x < name.length(); x++) {

            result = result + name.charAt(x);
            // concatenate hyphen (-)
            // if we are not at last character
            if (x != name.length()-1) {
                result += "-";
            }
        }
        return result;
    }
}

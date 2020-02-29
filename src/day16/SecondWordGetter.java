package day16;

public class SecondWordGetter {

    public static void main(String[] args) {
        
        // given a sentence with 3 words
        // get the second word
        
        // Steps:
        //second word is between first space and second space
        
        // getting location of space remind me of indexOf
        // getting String inside another String by beginning and ending index
        // remind me of substring
                        // 01234567890
        //String sentence = "I Love Java";

        String sentence = "You Understand Java";
        String secondWord;
        int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);
        
        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

        System.out.println(sentence.substring(2,6));
        secondWord = sentence.substring(firstSpaceIndex +1, lastSpaceIndex);
        System.out.println("secondWord = " + secondWord);

        // How to get first word:
        // in plain english : first word is starting from first character until first space
        String firstWord = sentence.substring(0, firstSpaceIndex);
        System.out.println("firstWord = " + firstWord);

        String lastWord = sentence.substring(15);
        System.out.println(lastWord);
    }
}

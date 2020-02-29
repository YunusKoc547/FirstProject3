package day20;

public class FindDogInASentence {

    public static void main(String[] args) {

        // given sentence, find out the location of the dog
        // going through the sentence 3 characters at a time
        // if the 3 characters happen to be a dog, we print out the index

        /*
        01234567890123456789012345678901234567890123
        I like Dog, Dogs are cute, Dogs are friendly



         */
        String msg = "I like Dog, Dogs are cute, Dogs are friendly";
        int i = 0;
        String threeCharacters = msg.substring(i, i+3);
        int dogCount = 0;


        for (i = 0; i < msg.length()-2 ; i++) {
            System.out.println(msg.substring(i, i+3));
            if (msg.substring(i, i+3).equals("Dog"))
            {dogCount++;
                System.out.println("BINGO!!! AT " + dogCount);
            }
        }


    }
}

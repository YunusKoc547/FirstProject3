package day22;

public class LoopControlStatement {

    public static void main(String[] args) {

        String msg = "I struggle with Java I Like Java I Love Java Everything is Awesome!";


        for (int idx = 0; idx < msg.length(); idx++) {

            if (idx % 2 == 1) {
                continue;
            }
            System.out.print(msg.substring(idx, idx + 1));
        }

        
        
        
        
        // Task 2

        for (int idx = 0; idx < msg.length() ; idx++) {
            String currentChar = msg.substring(idx,idx+1);
            if (currentChar.equalsIgnoreCase("a")) {
                System.out.println("LETTER FOUND!!!");
                break;
            }
            System.out.println("currentChar = " + currentChar);
            
        }
    }


}



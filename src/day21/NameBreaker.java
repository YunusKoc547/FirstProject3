package day21;

import javax.crypto.spec.PSource;

public class NameBreaker {

    public static void main(String[] args) {

        String name = "Yunus Koc";


        for (int i = 0; i <= name.length(); i++) {

            if (name.substring(i,i+1).equalsIgnoreCase("s")) {
                System.out.println("FOUND IT!!");
                break;
            }
            System.out.println(name.substring(i,i+1));


        }


    }
}


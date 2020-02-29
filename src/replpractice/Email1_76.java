package replpractice;

import java.util.Scanner;

public class Email1_76 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

       int indexOf_ = email.indexOf("_");
       int indexOfAt = email.indexOf("@");


        if (email.contains("_")) {
            System.out.println(email.substring(indexOf_+1, indexOfAt) +  email.substring(indexOf_,indexOf_+1) +email.substring(0, indexOf_) + email.substring(indexOfAt));
        }else {
            System.out.println(email);


        }



    }
}

package day09;

import java.util.Scanner;

public class LanguagePickerScannerVersion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String greeting = "";

        System.out.println("Please enter a number: ");

        int languageOption = scan.nextInt();

        if (languageOption == 1) {
            greeting = "Hello, SDET";
            System.out.println(greeting);
        }

        else if (languageOption == 2){
            greeting = "Salam, SDET";
            System.out.println(greeting);
        }

        else if (languageOption == 3){
            greeting = "Hola, SDET";
            System.out.println(greeting);
        }
        else if (languageOption == 4){
            greeting = "Privet, SDET";
            System.out.println(greeting);
        }
        else if (languageOption == 5){
            greeting = "Merhaba, SDET";
            System.out.println(greeting);
        }
        else if (languageOption == 6){
            greeting = "Szia, SDET";
            System.out.println(greeting);
        }
        else if (languageOption == 7){
            greeting = "Bonjour, SDET";
            System.out.println(greeting);
        }
    }
}

package day60;

import java.io.FileNotFoundException;

public class DangerZoneAgain {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException{

        System.out.println("THE START");
        // calling a method that declare to throws checked exception
        try {
            readMyFile();
        }catch (FileNotFoundException e) {
            System.out.println("HANDLING HERE!!! JUST MOVING ON!!");
        }
        Thread.sleep(3000);
        System.out.println("The End");

    }

    // document this method to tell the caller, the file you are about to read might not exists
    // and handle the consequences yourself
    // the exception type already exists for this type of situation is called
    // FileNotFoundException for java.util package
    public static void readMyFile() throws FileNotFoundException {

        System.out.println("Reading the file in my computer");
        throw new FileNotFoundException("Kaboom! file is not here!!!");

    }
}

package day60;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DangerZoneAgain2 {

    public static void main(String[] args) throws InterruptedException{

        System.out.println("THE START");

        readMyFile();

        Thread.sleep(3000);
        System.out.println("The End");

    }

    public static void readMyFile() {

        System.out.println("Reading the file in my computer");
        try {
            // we are throwing a checked exception
            // so It MUST BE HANDLED OR DECLARED, Here we chose to handle it with try catch
            // throw new FileNotFoundException("Kaboom! file is not here!!!");
            List<String> allLines = Files.readAllLines(Paths.get("PUT YOUR FILE PATH HERE"));
        }catch (IOException e) {
//        }catch (IOException e) {
            System.out.println("AHA!! CAUGHT YOU IN readMyFile!!!");
        }

    }
}

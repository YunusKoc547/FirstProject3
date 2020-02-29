package day58.exceptions2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFoundDemo {

    public static void main(String[] args) throws IOException {
        System.out.println("Before try catch");
        try {
            Files.readAllLines(Paths.get("file.txt"));
        }catch (Exception e) {
            System.out.println("Caught exception");
        }


        System.out.println("After try catch");
    }
}

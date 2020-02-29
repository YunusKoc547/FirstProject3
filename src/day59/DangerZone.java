package day59;

import java.io.IOException;

public class DangerZone {

    public static void main(String[] args) throws IOException{

        playWIthFire();
    }

    public static void playWIthFire() throws IOException {
        System.out.println("some consequences might happen");
        throw new IOException("NOW YOU ACTUALLY GET BURNED");
    }
}

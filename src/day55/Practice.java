package day55;

public class Practice {

    // any object created using this constructor
    // should call Practice(int x) constructor with value 100
    public Practice() {

        this(100);
        System.out.println("no arg constructor");
    }

    // any object you created using constructor must call no arg constructor first
    public Practice(int x) {

        System.out.println("1 arg constructor");
    }

    public static void main(String[] args) {
        // 25 --> 7-9-  15-18 - 7-10 --- done 28
        Practice t = new Practice();
    }
}

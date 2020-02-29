package day58.exceptions2;

public class CheckedExceptionDemo {

    public static void main(String[] args) throws Exception {

        System.out.println("Checked Exception in next line");

            Thread.sleep(1);
        System.out.println("After Thread.sleep");
    }
}

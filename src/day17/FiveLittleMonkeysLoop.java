package day17;

public class FiveLittleMonkeysLoop {

    public static void main(String[] args) {

        int monkeys = 5;

        while (monkeys >= 1) {
            System.out.println("There is " + monkeys + " more monkeys jumping on the bed!");
            --monkeys;
        }
        System.out.println("There are no more monkeys jumping on the bed!");
    }
}

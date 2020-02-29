package day17;

public class WhileLoopPractice {

    public static void main(String[] args) {
        // Count 1 to 5 then 5 to 1

        int counter = 5;
        while (counter <= 5) {
            System.out.print(counter + " "); // at this point counter value is 6
            counter++;
        }
        System.out.println();
        System.out.println("counter = " + counter);

        while (counter >=1) {
            --counter;
            System.out.print(counter + " ");
        }
    }
}

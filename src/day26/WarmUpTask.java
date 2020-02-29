package day26;

public class WarmUpTask {

    public static void main(String[] args) {

        int[] number = new int[] {1,2,3,4,5};

        number[3] = number[2] + number[1];
        System.out.println(number[3]);
        System.out.println("new value of fourth item = " + number[3]);
    }
}

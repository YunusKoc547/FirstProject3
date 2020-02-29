package day22;

public class LoopingThroughAnArrayInReverseOrder {

    public static void main(String[] args) {

        int [] scores = new int[4];
        scores [0] = 95;
        scores [1] = 70;
        scores [2] = 88;
        scores [3] = 100;

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        int elementCount = scores.length;       // 4
        int lastItemIndex = elementCount-1;     // 3

        for (int x = lastItemIndex; x >=0 ; x--) {
            System.out.println("index location " + x);
            System.out.println(scores[x]);



        }

    }
}

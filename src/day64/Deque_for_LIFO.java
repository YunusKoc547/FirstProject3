package day64;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_for_LIFO {

    public static void main(String[] args) {

        // How do we implement a LifoQueue if not using old class called Stack
        // we can use any of Deque interface implementation
        // Deque is a double ended Queue so we can add items as always
        // and when we remove we can removeLast last method to achieve Last in first out

        Deque<String> lifoQue = new LinkedList<>();
        lifoQue.add("review the class");
        lifoQue.add("do your homework");
        lifoQue.add("attend the class");
        lifoQue.add("Say bye to Java");

        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());

        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());

        String str = "All lanes are currently closed. There was accident. Commuters' should avoid the area. ";



    }
}

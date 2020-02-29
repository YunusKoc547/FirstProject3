package day36;

public class MethodWithParameter {

    public static void main(String[] args) {
        addOneHundred(Integer.valueOf(100));
        int num = 7;
        addOneHundred(num);
        System.out.println(num);
    }

    // this is what happens when we pass num to a method

    public static void addOneHundred(int x) {
        x = x + 100;
        System.out.println(x);
    }

}

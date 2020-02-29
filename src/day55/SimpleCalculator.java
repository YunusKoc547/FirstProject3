package day55;

public class SimpleCalculator {

    int result;

    public SimpleCalculator addNum(int num) {
        this.result += num;
//        Calculator c = new Calculator();
//        return c;
        return this;
    }

    public SimpleCalculator minusNum(int num) {
        this.result -= num;
        return this;
    }
    
    public void displayFinalResult() {

        System.out.println("result = " + result);
    }

    public static void main(String[] args) {

        SimpleCalculator c1 = new SimpleCalculator();
        c1.addNum(100);
        System.out.println(c1.result);

        c1.addNum(100);
        System.out.println(c1.result);
        c1.minusNum(50);
        System.out.println(c1.result);

        c1.displayFinalResult();
    }
}

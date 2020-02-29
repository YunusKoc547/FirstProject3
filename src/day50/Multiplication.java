package day50;

public class Multiplication extends Question{

    public Multiplication(int num1, int num2) {
        super("Multiplication Question","x");
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void calculate() {
        answer = num1 * num2;
        calculated = true;
    }
}

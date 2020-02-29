package day48;

public class Lion extends Mammals {

    // public abstract void makeNoise();
    // public abstract void drinkMilk();


    @Override
    public void drinkMilk() {
        System.out.println("LION DRINK MILK");
    }

    @Override
    public void makeNoise() {
        System.out.println("LION SAY ROARRRRRRRRRR!!!!");
    }

    public static void main(String[] args) {

        Lion l1 = new Lion();
        l1.drinkMilk();
        l1.makeNoise();
    }
}

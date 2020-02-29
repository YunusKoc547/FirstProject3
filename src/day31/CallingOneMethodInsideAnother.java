package day31;

public class CallingOneMethodInsideAnother {

    public static void main(String[] args) {

        finallyAwake();
    }
    public static void finallyAwake() {
        wakeUp();
        drinkCoffee();
    }




        public static void wakeUp() {
            System.out.println("Open your eyes");
            System.out.println("Close your eyes");
            System.out.println("Hear your alarm? open it again!");
        }
        public static void drinkCoffee() {
            System.out.println("Put coffee in your coffee machine");
            System.out.println("Make your coffee");
            System.out.println("Drink your coffee");
        }

}

package day17;

public class DoWhileLoop {

    public static void main(String[] args) {

        int apples = 1;
        int totalApples = 10;
        do {
            System.out.println("Eating an apple");
            apples++;
        }while (apples <= totalApples);

        int number = 1;
        int until = 10;

        do {
            System.out.println(number);
            number++;
        }while (number<=until);


    }
}

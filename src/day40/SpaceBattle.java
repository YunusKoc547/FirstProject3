package day40;

public class SpaceBattle {

    public static void main(String[] args) {

        SpaceShip s1 = new SpaceShip();
        s1.name = "Orville";
        s1.setInitialPosition(1,5);
        System.out.println("s1 = " + s1);

//        s1.setDirection("up");
//        s1.move1Block();
//        System.out.println("s1 = " + s1);
//        System.out.println();
//
//        s1.setDirection("ABC");
//        s1.move1Block();
//        System.out.println("s1 = " + s1);
//        System.out.println();
//
//        s1.setDirection("right");
//        s1.move1Block();
//        System.out.println("s1 = " + s1);
//        System.out.println();
        
        s1.move1Block("up");
        s1.move1Block("right");
        s1.move1Block("up");
        s1.move1Block("down");
        s1.move1Block("home");

        System.out.println("s1 = " + s1);
    }
}

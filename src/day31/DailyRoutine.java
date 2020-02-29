package day31;

public class DailyRoutine {


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
    public static void prepareKidsForSchool() {
        System.out.println("Kiss your kid to wake them up");
        System.out.println("Wake them up for 10 times");
        System.out.println("Prepare their breakfast and lunch");
        System.out.println("Eat with them");
    }
    public static void takeKidsToSchool() {
        System.out.println("Take them to bus stop");
        System.out.println("Say goodbye");
    }
    public static void studyJava() {
        System.out.println("Think about java waking up");
        System.out.println("Think about java drinking coffee");
        System.out.println("Think about java preparing kids for school");
        System.out.println("Think about java taking them to school");
        System.out.println("Eventually sit down and study java, practice practice!!!");
        System.out.println("Review last classes, come ready for the class");
    }
    public static void sayILoveJava300Times() {
        for (int i = 1; i <= 300 ; i++) {
            System.out.print("I Love Java | ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        wakeUp();
        drinkCoffee();
        prepareKidsForSchool();
        takeKidsToSchool();
        studyJava();
        sayILoveJava300Times();
    }
}

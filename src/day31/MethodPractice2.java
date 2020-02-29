package day31;

public class MethodPractice2 {

    public static void count1to10() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // DOES NOT MATTER WHERE YOU PUT THE METHOD
        // AS LONG AS IT'S INSIDE THE CLASS{ }
        // AND OUTSIDE ANY OF THE METHOD
    }
    public static void main(String[] args) {

        // write a piece of reusable code to count from 1 to 10
        // give a name count1to10
        // no need for object when being called
        // it should be accessible anywhere in your project
        // it does not return any value
        // does not need any external data when being called

        // Create a method called countDownFrom20tillOne
        // Create a method to print odd numbers from 1-100: printOddNumbers1to100();
        // Create a method to spell your name: Yunus - Y - u - n - u - s

        count1to10();
        count1to10();
        // optionally you can call using classname.methodName();
        MethodPractice2.count1to10();
    }
}

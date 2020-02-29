package day08;

public class WarmUpTask1 {

    public static void main(String[] args) {

        int votingAge = 20;

        System.out.println(votingAge >= 18);
        if(votingAge >= 18) {

            System.out.println(votingAge + " is old enough");
            System.out.println("You are ready to vote!!!");
        }

        else {
            System.out.println(votingAge + " is too young");
            System.out.println("Wait until you are 18!");
        }


    }
}

package day34;

public class ReturnPractice {

    /*
        what is return keyword is used

        break VS return
        break -->> loop : break out of the loop
              -->> switch : break out of the case

        return -->> inside a method
        return the value out of a method with a return type
        the moment the return keyword is reached it will terminate the method
        can it be used in void method??
        Yes BUT ONLY IN THIS WAY : return;
        what is the benefit of using in void method
        to terminate the method early
        */

    public static void main(String[] args) {
        print4Min4CharacterLengthName("Yunus");
        print4Min4CharacterLengthName("Yun");

    }



    public static void print4Min4CharacterLengthName(String name) {

        // if the name has less than 4 chars, get out of the method

        if (name.length() < 4) {
            return;
        }
        System.out.println(name);
    }
}

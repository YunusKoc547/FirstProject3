package replpractice;

import java.util.Scanner;

public class Methods8SplitPersonInfo_153 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String s)
    {
        String[] split = s.split(",");
        String firstName = split[0];
        String lastName = split[1];
        String age = split[2];

        System.out.println("person name: " + firstName + " last name: " + lastName + " age: " + age);



        //your code here


    }//end person
}

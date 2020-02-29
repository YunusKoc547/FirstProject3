package day50;

import java.util.Arrays;
import java.util.List;

public class MathTest {

    public static void main(String[] args) {

        Addition q1 = new Addition(10,90);
        System.out.println("q1 : " + q1);
        q1.calculate();
        System.out.println("q1 : " + q1);

        Subtraction q2 = new Subtraction(80,10);
        System.out.println("q2 = " + q2);
        q2.calculate();
        System.out.println("q2 = " + q2);

        Subtraction q3 = new Subtraction(10,80);
        System.out.println("q3 = " + q3);
        q3.calculate();
        System.out.println("q3 = " + q3);
        
        Multiplication m1 = new Multiplication(5,6);
        System.out.println("m1 = " + m1);
        m1.calculate();
        System.out.println("m1 = " + m1);

        Division d1 = new Division(5,1);
        System.out.println("d1 = " + d1);
        d1.calculate();
        System.out.println("d1 = " + d1);
        
        Division d2 = new Division(5,0);
        System.out.println("d2 = " + d2);
        d2.calculate();
        System.out.println("d2 = " + d2);
        
        
        
        List<Question> allTestQuestions = Arrays.asList(q1,q2,q3,m1,d1,d2);
        for (Question eachQ : allTestQuestions) {
            System.out.println("eachQ = " + eachQ);
        }
    }
    
}

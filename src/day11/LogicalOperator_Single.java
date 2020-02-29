package day11;

public class LogicalOperator_Single {

    public static void main(String[] args) {

        // && is called short circuit AND
        // ---> it does not check next condition as long as the first condition is false
        // ---> just like if you have multiple condition for rocket launching
        //  isEngineRunning, isCommunicationSystemWorking, isAirEnough

        //  isEngineRunning && isCommunicationSystemWorking && isAirEnough
        // if isEngineRunning is false then it does not check next conditions

        // & -->> CHECK EACH AND EVERY CONDITION NO MATTER WHAT

        //  isEngineRunning & isCommunicationSystemWorking & isAirEnough
        // if isEngineRunning is false
        // it still check isCommunicationSystemWorking
        // isAirEnough
        // and eventually give you the outcome
/*
        System.out.println(7>5 && 1>7);
        System.out.println(5>5 && 1>7);
        System.out.println(1>5 && 9>7);

        System.out.println(7>5 & 1>7);
        System.out.println(5>5 & 1>7);
        System.out.println(1>5 & 9>7);

*/

       // System.out.println(9/0); // ERROR!! CAN NOT DIVIDE BY 0
        // I want to check whether dividing 9 by 0 is 3
        //System.out.println(9/0==3);

        // combine the result of 5 is more than 10
        // and 9 divided by 0 is 3
        System.out.println(5>10 & 9/0==3);


    }
}

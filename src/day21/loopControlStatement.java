package day21;

public class loopControlStatement {

    public static void main(String[] args) {

        // break
        // if the line containing break reaches the loop will stop!

//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//            break;
//        }

        // while iterating over 1 to 10
        // break out of the loop when it is 5

//        for (int i = 1; i <= 10 ; i++) {
//            System.out.println(i);
//            if (i==5) {
//                break;
//            }


        int sum = 0;
        for (int x = 1; x <= 10; x++) {



            if (sum > 40) {
                System.out.println("final sum is " + sum);
                break;

            }else {
                // we need to add the sm after we make sure it did not go over 40
                sum = sum + x;
            }
            //we need to add the sum after we make sure it did not go over 40

        }
        System.out.println("sum = " + sum);



        // continue
        // if line contains break reaches the loop will skip to next iteration
    }
}

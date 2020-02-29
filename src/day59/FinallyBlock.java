package day59;

public class FinallyBlock {

    public static void main(String[] args) {

        // in some cases we want to run certain code
        // no matter exception happen or not
        // as part of catch

        int[] nums = {1,4,6};

        try {

//            System.out.println("nums[100] = " + nums[100]);
            throw new ArrayIndexOutOfBoundsException("Index 100 out of bounds for length 3");
        } catch (Exception e) {
            // HOW DO I GET THE MESSAGE OUT OF THE EXCEPTION
            // Any exception object (can) have message field
            // and it can be extracted by calling getMessage method
            System.out.println("Exception caught \n " + e.getMessage());

        }finally {
            System.out.println("THIS CODE WILL ALWAYS RUN NO MATTER WHAT");
        }

        System.out.println("THE END");
    }
}

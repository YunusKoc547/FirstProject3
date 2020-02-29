package replpractice;

public class MethodOverloading1_188 {

    public static void main(String[] args) {
    }

    public static int findMax(int[] num) {

        int maxInt = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > maxInt) {
                maxInt = num[i];
            }
        }
        return maxInt;
    }
    public static double findMax(double[] nums) {
        double maxDouble = nums[0];
        for (double currentNum : nums) {
            if (currentNum > maxDouble) {
                maxDouble = currentNum;
            }
        }
        return maxDouble;
    }
}

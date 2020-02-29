package replpractice;

public class MethodsWithArrays5BadProducts_217 {

    public static boolean badP(int[] products,int limit)
    {
        int brokenCounter = 0;

        for (int i = 0; i < products.length; i++) {
            if (products[i] == 0) {
                brokenCounter++;
            }
        }
        if (brokenCounter < limit) {
            return true;
        }else {
            return false;
        }
    }
}

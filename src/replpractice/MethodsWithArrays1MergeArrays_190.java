package replpractice;

public class MethodsWithArrays1MergeArrays_190 {

    public static int[] mergR(int[] a,int[] b) {

        int totalLength = a.length + b.length;
        int[] arr= new int[totalLength];
        int i=0;

        for (int eachElement : a) {
            arr[i] = eachElement;
            i++;
        }
        for (int eachElement : b) {
            arr[i] = eachElement;
            i++;
        }
        return arr;


    }//end mergR

    public static void main(String[] args)
    {

    }

}

package replpractice;

import java.util.ArrayList;

public class MethodsWithArrayList5SizeGet_195 {

    public static int sum(ArrayList<Integer> ints)
    {
        //write code here
        int sum = 0;
        for (int i = 0; i < ints.size(); i++) {
            sum += ints.get(i);
        }
        return sum;
    }
}

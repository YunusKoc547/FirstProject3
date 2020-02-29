package replpractice;

import java.util.ArrayList;

public class MethodWithArrayList10AppendPosSum_201 {

    public static void main(String[] args)
    {

    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> numsList) {

        int sum = 0;
        for (int i = 0; i < numsList.size(); i++) {
            if (numsList.get(i) < 0) {
                numsList.remove(numsList.get(i));
                --i;
            }else {
                sum = sum + numsList.get(i);
            }
        }

        numsList.add(sum);
        return numsList;
    }
}

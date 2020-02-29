package replpractice;

import java.util.ArrayList;


public class MethodsWithArrayList162Times_215 {

    public static void main(String[] args)
    {

    }
    //create your method below

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> numbers) {
        ArrayList<Integer> list = new ArrayList<>(numbers);
        for (int i = 0; i < list.size(); i += 2) {
            list.add(i, list.get(i));
        }
        return list;
    }
}

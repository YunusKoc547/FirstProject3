package replpractice;

public class MethodsWithReturn1CountAppearance_163 {

    public int  count_appearance(String[] arr,String t)
    {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(t)) {
                count++;
            }
        }



    return count;
    } //end  count_appearance
}

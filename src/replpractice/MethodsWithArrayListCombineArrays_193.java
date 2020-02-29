package replpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsWithArrayListCombineArrays_193 {

    public static String combineRs(String[] r1,String[] r2)
    {
        String combine = "";
        for (int i = 0; i < r1.length; i++) {
            combine += r1[i];
        }
        for (int i = 0; i < r2.length; i++) {
            combine += r2[i];
        }

        return combine;

    }
}

package day22;

public class ArrayCreation2 {

    public static void main(String[] args) {

        int [] ages = new int[]{3,5,11,33,57,18};



        int itemCount = ages.length;
        System.out.println("itemCount = " + itemCount);


        for (int x = 0; x < itemCount; x++) {

            System.out.println(ages[x]);
        }


    }
}

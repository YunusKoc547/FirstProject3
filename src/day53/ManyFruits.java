package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManyFruits {

    public static void main(String[] args) {

        Fruit f1 = new Orange("sour-sweet","reddish",11);
        // Fruit is reference type, Apple is actual object Type
        Fruit f2 = new Apple("crispy but tasteless","hot red", "Gala");
        Fruit f3 = new Orange("sour","orange",12);
        Fruit f4= new Orange("very sweet", "Blood Red",10);

        Fruit[] myFruits = { f1,f2,f3,f4};

        for (Fruit each : myFruits) {
            each.getDigested();
        }

        List<Fruit> fruitList = new ArrayList<>(Arrays.asList(f1,f2,f3,f4));

        for (Fruit each : fruitList) {

            System.out.println("each.toString() = " + each.toString());
            System.out.println(each.getClass().getSimpleName());
        }
    }
}

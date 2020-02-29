package day36;

import java.util.ArrayList;
import java.util.List;

public class ArraysListIntro {

    public static void main(String[] args) {

        // How do we create a ArrayList Object
        ArrayList<String> lst1 = new ArrayList<>(); // new ArrayList<String>();
        // IT WILL ONLY STORE OBJECT!!! NOT PRIMITIVE
        // ArrayList<int> lst2 = new ArrayList<>();

        // Correct way to create ArrayList object that store whole number
        // is to use Wrapper class type. Primitive type is FORBIDDEN!!!

        ArrayList<Integer>lst2 = new ArrayList<>(); // new ArrayList<Integer>();

        ArrayList<Long> lst3 = new ArrayList<>(); // new ArrayList<Long>();

        ArrayList<Double> lst4 = new ArrayList<>(); // new ArrayList<Double>();

        // OPTIONALLY YOU CAN CREATE IN THIS WAY

        // List is a more general data type compared to ArrayList is more concrete type
        // ArrayList is one type of list
        // Just like dog is one type of Animal
        List<String> myLst = new ArrayList<>();

    }
}

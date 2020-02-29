package day37;

import java.util.ArrayList;
import java.util.List;

public class TeamMateArrayList {

    public static void main(String[] args) {
        
        List<String> teamMates = new ArrayList<>();
        
        teamMates.add("Akbar");
        teamMates.add("Kuzzat");
        teamMates.add("Murodil");
        teamMates.add("Maruf");
        teamMates.add("Vasyl");
        teamMates.add("Muhtar");
        teamMates.add("Asyia");
        teamMates.add("Mike");
        teamMates.add("Guljannat");
        teamMates.add("Support-Team");

        System.out.println("teamMates = " + teamMates);

        // first item and last item
        System.out.println("\nFirst Item = " + teamMates.get(0));
        // last item --> using last index -->> size()-1
        int lastItemIndex = teamMates.size()-1;
        System.out.println("\nLast Item = " + teamMates.get(lastItemIndex));

        // print one by one
        System.out.println("\nALL ITEMS");
        for (int i = 0; i < teamMates.size(); i++) {
            System.out.println("\tItem = " + (i + 1) + teamMates.get(i));
        }

        // All items in reverse order
        System.out.println("\nALL ITEMS in reverse order: ");
        for (int i = lastItemIndex; i >= 0; i--) {
            System.out.println("\tItem "  + (i+1) + " = " + teamMates.get(i));
        }
        
        // print 2 items at a time
        // for example : 1-2, 2-3, 3-4, 4-5, 4-5, 5-6 ...
        System.out.println("\nPrint 2 items at a time:");
        for (int x = 0; x <= teamMates.size()-2; x++) {
            System.out.println(teamMates.get(x) + " --- " + teamMates.get(x + 1));
        }

        // print 2 items at a time
        // for example : 1-2, 3-4, 5-6, 7-8, 9-10
        System.out.println("\nPrint 2 items at a time without repeating: ");
        for (int i = 0; i <= teamMates.size()-2; i+=2) {

            System.out.println("" + i +(i+1));
            System.out.println("\t" + teamMates.get(i) + " --- " + teamMates.get(i+1));
        }

        // Pair them up by 3
        for (int i = 0; i <= teamMates.size()-3; i++) {
            System.out.println(teamMates.get(i) + " --- " + teamMates.get(i+1) + "---" + teamMates.get(i+2) );
        }

        String result = "";
        for (int i = 0; i < teamMates.size(); i++) {
            result = result + teamMates.get(i);

        }
        System.out.println("result = " + result);
        //TODO : Remove The Last Dash


        //TODO : How can we turn a List into a String and Store it? and manipulate it
        String lstToString = teamMates.toString();
        System.out.println("lstToString after replacing  = \n\t"
                + lstToString.replace(", ", "-").replace("[", "").replace("]", ""));

    }
}

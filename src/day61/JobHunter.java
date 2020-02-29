package day61;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class JobHunter {

    public static void main(String[] args) {

        Job j1 = new Job("GA",120000,"BOFA");
        Job j2 = new Job("VA",110000,"Amazon");
        Job j3 = new Job("GA",150000,"Tesla");

        System.out.println("j1.compareTo(j2) = " + j1.compareTo(j2));
        System.out.println("j2.compareTo(j3) = " + j2.compareTo(j3));

        List<Job> myFavJobs = new LinkedList<>();
        myFavJobs.add(new Job("GA",120000,"BOFA"));
        myFavJobs.add(new Job("NY",110000,"Amazon"));
        myFavJobs.add(new Job("GA",140000,"Facebook"));
        myFavJobs.add(new Job("GA",150000,"Apple"));
        myFavJobs.add(new Job("GA",145000,"Microsoft"));


        System.out.println("myFavJobs before = " + myFavJobs);
        Collections.sort(myFavJobs);
        System.out.println("myFavJobs after = " + myFavJobs);

        // Comparator.reverseOrder() will give you an object with reversed company name
        Collections.sort(myFavJobs, Comparator.reverseOrder());
        System.out.println("myFavJobs after 2 = " + myFavJobs);
        
        // Collections.reverseOrder() will also give you an object with reverseOrder
        // below code will try to sort the list in reverse order from natural
        Collections.sort(myFavJobs,Collections.reverseOrder());
        System.out.println("myFavJobs = " + myFavJobs);

    }
}

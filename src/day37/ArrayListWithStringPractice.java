package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithStringPractice {

    public static void main(String[] args) {

        List<String> superHeroes = new ArrayList<>();
        superHeroes.add("Superman");
        superHeroes.add("Batman");
        superHeroes.add("Cyborg"); // when we remove Cyborg, Flash become the item at index 2
        superHeroes.add("Flash");
        superHeroes.add("Aquaman");
        superHeroes.add("Wonder Woman");

        System.out.println("superHeroes = " + superHeroes);
//      Do we have super man in the list?
        System.out.println("superHeroes.contains(\"Superman\") = " + superHeroes.contains("Superman"));

        // does this contain an item with exact value of man
        System.out.println("superHeroes.contains(\"man\") = " + superHeroes.contains("man"));

        // remove any heroes that do not have man in the String
        for (int x = 0; x < superHeroes.size(); x++) {
            String currentHero = superHeroes.get(x);
            if (!currentHero.contains("man")) {
                superHeroes.remove(currentHero);
                // once hero is removed, this index will be filled by next item
                // so we need to decrease the index by 1 so stay at same index
                --x;
            }
        }
        System.out.println("superHeroes = " + superHeroes);

        // take away from here :
        // removing item during the for loop
        // when you remove 1 ite, you will have one less item in the list
        // everything after the removed item will move to one index to the left
        // so in order to not miss the item right after the removed item
        // we need to decrease the index by one to stay at same index after removing
        
        List<String> superHeroCopy = new ArrayList<>(superHeroes);
        System.out.println("superHeroCopy = " + superHeroCopy);

        // THIS WILL CREATE AN UNMODIFIABLE LIST !!!
        List<String> topics = Arrays.asList("Java","Selenium","Database","API");
        System.out.println("topics = " + topics);

        // HERE COPYING EVERYTHING inside topic to topicCopy
        // AND it's just regular arrayList, we can do anything with it
        List<String> topicsCopy = new ArrayList<>(topics);
        System.out.println("topicsCopy = " + topicsCopy);
    }
}
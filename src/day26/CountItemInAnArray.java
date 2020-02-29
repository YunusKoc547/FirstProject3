package day26;

import java.util.Arrays;

public class CountItemInAnArray {

    public static void main(String[] args) {

        String[] marvelHeroes = {"Iron man", "Captain America", "Spiderman", "Black Panther", "Hulk", "Black Widow", "Wanda",
                "Captain Marvel", "Iron man", "Captain America", "Spiderman", "Black Panther", "Hulk"};

        System.out.println("Marvel Heroes = " + Arrays.toString(marvelHeroes));
        int sizeOfArray = marvelHeroes.length;
        System.out.println("Hero Count = " + sizeOfArray);

        String itemToSearch = "Iron man";
        int countOfItem = 0;
        for (String eachHero : marvelHeroes) {
            if (eachHero.equals(itemToSearch)) {
                countOfItem++;
            }
        }
        System.out.println("count of item = " + countOfItem);
        
        int cntOfBlackInName = 0;

        for (String eachHero : marvelHeroes) {
            // in order to not care about the case, make all lowercase then check contains
            if (eachHero.toLowerCase().contains("black")) {
                cntOfBlackInName++;
            }
            
        }

        System.out.println("cntOfBlackInName = " + cntOfBlackInName);
        
    }

    // COUNT THE HERO WITH THE NAME CONTAINS BLACK
    
    
}

package day27;

public class MultiDimensionalArray_Practice {

    public static void main(String[] args) {
        // find who has the longest name
        String[] developersTeam ={"Vladislav", "Hasan", "Tolkun", "Abide" };
        String[] testerTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalystTeam = {"Lisa", "Ershad", "Naila"};
        String [][] scrumTeam = {developersTeam, testerTeam, businessAnalystTeam};
        int maxLength = scrumTeam[0][0].length();
        for(String[] each1DArray   : scrumTeam   ) {
            for ( String eachElement : each1DArray){
                if(maxLength <eachElement.length()  ){
                    maxLength = eachElement.length();
                }
            }
        }
        System.out.println(maxLength);
        for(String[] each1DArray   : scrumTeam   ) {
            for ( String eachElement : each1DArray){
                if(maxLength == eachElement.length()  ){
                    System.out.println(eachElement);
                }
            }
        }
    }
}

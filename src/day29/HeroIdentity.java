package day29;

public class HeroIdentity {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark J Kent";
        // hide this hero identity
        // String heroX = "Superman-******";

        // given a String with hero code and name separated by -
        // turn this String into hero code and * with same length as hero name

        // Plain English Logic :

        // split it by -  to get the code and full name
        // get the length of full name
        // generate starts with same length as full name character count
        // concatenate heroCode with dash and stars and save it

        // OR once the star is generated, replace full name with Stars

        String[] heroSplit = hero1.split("-");
        String heroCode = heroSplit[0];
        String fullName = heroSplit[1];

        int nameCharCount = fullName.length();
        String star = "";
        for (int x = 0; x < fullName.length(); x++) {
            star = star + "*"; // stars += "*";
        }
        System.out.println(fullName);
        System.out.println(star);

        System.out.println("hero1 = " + hero1);


    }
}

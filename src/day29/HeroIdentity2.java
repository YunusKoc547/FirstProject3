package day29;

public class HeroIdentity2 {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark J Kent";

        String[] heroSplit = hero1.split("-");
        String heroCode = heroSplit[0];
        String fullName = heroSplit[1];

        String stars = "";
        for (int i = 1; i <= fullName.length() ; i++) {
            stars = stars + "*";
        }
        String heroX = hero1.replace(fullName,stars);
        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + heroX);
        
    }
}

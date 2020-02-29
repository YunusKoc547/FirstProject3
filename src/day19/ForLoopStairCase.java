package day19;

public class ForLoopStairCase {

    public static void main(String[] args) {


//        *
//        * *
//        * * *
//        * * * *






//        System.out.println(star);
//        star = star + "* ";
//        System.out.println(star);
//        star = star + "* ";
//        System.out.println(star);
//        star = star + "* ";
//        System.out.println(star);
//        star = star + "* ";
//        System.out.println(star);

        String star ="";

        for (int i = 1; i <=50 ; i++) {

            star += "* ";
            System.out.println(i + " " + star);
        }

    }
}

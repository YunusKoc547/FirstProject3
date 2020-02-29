package day17;

public class WakeUp_NameCorrector {

    public static void main(String[] args) {

        String name = "yunus";
        String name2 = "Yunus";

//        name = name.replace("y", "Y");
//
//        System.out.println(name);

        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println(name);


    }
}

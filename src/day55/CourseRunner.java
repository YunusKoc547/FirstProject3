package day55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRunner {

    public static void main(String[] args) {

        List<String> lst =
                new ArrayList<>(Arrays.asList("Muge","Sumeyye","Hasan","Astrit","Vlad","Zehra"));

        Course java = new Course("Java",lst);
        System.out.println("java = " + java);

        java.studentNames.add("Gail");
        java.studentNames.add("Mohammed");
        java.studentNames.add("Ayjeren");
        java.studentNames.add("Ayse");

        System.out.println("java.studentNames = " + java.studentNames);
    }
}

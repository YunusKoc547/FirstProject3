package day55;

import java.util.List;

public class Course {

    String name;
    List<String> studentNames;

    public Course(String name, List<String> studentNames) {
        this.name = name;
        this.studentNames = studentNames;
    }

    public void addStudent(String name) {
        studentNames.add(name);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", studentNames=" + studentNames +
                '}';
    }
}

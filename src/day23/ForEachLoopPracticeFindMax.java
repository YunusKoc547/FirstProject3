package day23;

public class ForEachLoopPracticeFindMax {

    public static void main(String[] args) {

        long[] salaries = {70000, 100000, 120000, 150000, 200000};

        long maxSalary = salaries[0];

        for (long salary : salaries) {


            if (salary > maxSalary) {
                maxSalary = salary;
            }
        }
        System.out.println("maxSalary = " + maxSalary);
    }
}

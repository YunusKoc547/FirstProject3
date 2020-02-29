package day23;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        /*
        create a long array or 5 items called salaries
        put your salary amounts that ok for your offer
        use for each loop to iterate over them
        then print them out
         */

        long[] salaries = {70000, 100000, 120000, 150000, 200000};
        int salariesCount = salaries.length;

        for (int x = 0; x < salariesCount ; x++) {
            System.out.println(salaries[x]);
        }

        System.out.println();

        for (long eachSalary : salaries) {
            System.out.println("Each Salary = " + eachSalary);
        }

        System.out.println();
        
        for (long salary : salaries) {
            if ( salary <= 100000) {
                continue;   // skip
            }
            System.out.println("salaries over 100k = " + salary);
        }


    }
}

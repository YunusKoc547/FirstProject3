package day51;

public class PersonComparing {

    public static void main(String[] args) {

        Person p1 = new Person("Arafat",34);
        Person p2 = new Person("Zhibekchach",18);
        Person p3 = new Person("Asina",18);

        int result = p2.compareTo(new Person("Jon Snow",27));

        System.out.println("result = " + result);

        // print out the name of younger person between p1 and p3
        // it's asked to use compareTo method we just created
        if (p1.compareTo(p3) == 1) {
            System.out.println(p3.name);
        }else {
            System.out.println(p1.name);
        }

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(p1.compareTo(p2));
        System.out.println(p2.compareTo(p3));

        // compare p1 and p2 by age
        // if p1 is older print 1
        // if they are same age print 0
        // if p2 is older print -1


//        if (p1.age == p2.age) {
//            System.out.println(0);
//        }else if (p1.age > p2.age) {
//            System.out.println(1);
//        }else{
//            System.out.println(-1);
//        }
    }
}

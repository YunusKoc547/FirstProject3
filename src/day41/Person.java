package day41;

public class Person {

    // private makes it only accessible within the same class
    private String name;
    private int age;
    private long ssn;

    // what if I want to only get the name
    public String getName() {
        return name;
    }
    // what if I want to only change the name
    public void setName(String newName) {
        name = newName;
    }

    // write a method to give value of the filed
    public void setAll(String newName, int newAge, long newSsn) {
        // YOU CAN POUT WHATEVER CHECK HERE TO MAKE SURE
        // THE DATA IS CORRECT or any other logic
        name = newName;
        age = newAge;
        ssn = newSsn;
    }

    public void setAge(int newAge) {
        // YOU HAVE OPTION TO ADD BUNCH OF VALIDATION
        // TO MAKE SURE WE DON'T HAVE INVALID AGE HERE
        age = newAge;
    }

    public int getAge() {
        return age;
    }
    public void setSsn(long newSsn) {
        ssn = newSsn;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}

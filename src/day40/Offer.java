package day40;

public class Offer {

    String location;
    String company;
    long salary;
    boolean isFullTime;

    // This is an instance method to print all the information about Offer object
    // no parameter and no return type

    // Inside instance method we can directly access instance variable
    public void displayInformation() {
        System.out.println("Location = " + location + ", " + "Company = " + company + ", " + "Salary = $" + salary + ", " + "isFullTime = " + isFullTime);
    }

    // Write a method called turnToFullTime
    public void turnToFullTime() {
        if (isFullTime == false) {
            isFullTime = true;
        }else {
            System.out.println("ALREADY FULLTIME!");
        }
    }

    // Write a method to change the location of Offer
    // to the location user passed
    public void changeLocation(String newLocation) {
        location = newLocation;
    }

    // Write a method to accept 4 parameters to change all info about offers
    public void changeAllInfo(String newCompany, String newLocation, int newSalary, boolean newIsFullTime) {
        company = newCompany;
        location = newLocation;
        salary = newSalary;
        isFullTime = newIsFullTime;
        // an instance method can call another instance method
        // an instance method can use any instance fields
        // since we already have functionality to display information
        // we called it here display new information after modifying
        displayInformation();
    }

    // write a method to check the offer belong to 100k club
    public boolean is100KOffer() {
        return salary >= 100000;
    }

    // Create an instance method called toString
    // has no parameter
    // return String representation of the Offer Object
    // In below format
    // [Location = Virginia, Company = Amazon, Salary = $150000, isFullTime = true;

    public String toString() {
        return "[Location = " + location + ", " + "Company = " + company + ", " + "Salary = $" + salary + ", " + "isFullTime = " + isFullTime + "]";
    }



}

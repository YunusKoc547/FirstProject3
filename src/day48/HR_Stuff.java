package day48;

import java.util.Arrays;
import java.util.List;

public class HR_Stuff {

    public static void main(String[] args) {

        // Employee is abstract super type
        // HourlyEmployee and FullTimeEmployee is specific tyoe

        // if we have Employee data type for el variable
        // we can write down the address of anything IS-A Employee

        Employee e1 = new HourlyEmployee("Subi", 101, 55, 2000);
//        e1.calculateAnnualSalary();
//        e1 = new FullTimeEmployee("Ainura", 103, 10000);
//        e1.calculateAnnualSalary();
//        System.out.println("e1 = " + e1);

        Employee e2 = new HourlyEmployee("Roksana", 102,57,2080);
        Employee e3 = new FullTimeEmployee("Dennis", 104, 13000);

        // what is the easiest way to store these 3 objects together
        List<Employee> allEmployees = Arrays.asList(e1,e2,e3);

        for (Employee eachEmployee : allEmployees) {
//            System.out.println("eachEmployee = " + eachEmployee);
            System.out.println(" Name is : " + eachEmployee.name);
            eachEmployee.calculateAnnualSalary();
        }
    }
}

package com.bridgelabz.emp_mgmt2;

import java.util.Random;

public class EmployeeManagementUsingClasses {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Management using classes.");
        Random random = new Random();
        int empWagePerHr = 20;
        int fullDayHr = 8;
        int dailyWage = 0;

        int attendance = random.nextInt(2);
        if(attendance==1){
            System.out.println("Employee is present.");
        }else{
            System.out.println("Employee is absent.");
        }
        dailyWage= attendance*empWagePerHr*fullDayHr;
        System.out.println("Daily wage: "+ dailyWage);
    }

}

package com.bridgelabz.emp_mgmt2;

import java.util.Random;

public class EmployeeManagementUsingClasses {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Management using classes.");
        Random random = new Random();
        int empWagePerHr = 20;
        int fullDayHr = 8;
        int dailyWage = 0;
        int partTimeHour = 4;


        int attendance = random.nextInt(3);
        String attendanceType = "";
        switch(attendance){
            case 1:
                dailyWage = empWagePerHr*fullDayHr;
                attendanceType= "full-time";
                break;

            case 2:
                dailyWage = empWagePerHr*partTimeHour;
                attendanceType = "part-time";
                break;
            default:
                attendanceType= "absent";
        }

        System.out.println("Employee is "+attendanceType+". Daily wage is: "+ dailyWage);

    }

}

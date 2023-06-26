package com.bridgelabz.emp_mgmt2;

import java.util.Random;

public class EmployeeManagementUsingClasses {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Management using classes.");
        Random random = new Random();
        int empWagePerHr = 20;
        int fullDayHr = 8;

        int partTimeHour = 4;
        int workingDaysPerMonth=20;
        int totalWorkingDays=20;
        int workingDays=0;
        int totalWage=0;
        //int attendance = random.nextInt(3);
        //String attendanceType = "";
        while(workingDays<totalWorkingDays) {
            int dailyWage = 0;
            int attendance = random.nextInt(3);
            String attendanceType = "";
            switch (attendance) {

                case 1:
                    dailyWage = empWagePerHr * fullDayHr;
                    attendanceType = "full-time";
                    break;

                case 2:
                    dailyWage = empWagePerHr * partTimeHour;
                    attendanceType = "part-time";
                    break;
                default:
                    attendanceType = "absent";
            }

            System.out.println("Employee is " + attendanceType + ". Daily wage is: " + dailyWage);
            totalWage+= dailyWage;
            workingDays++;
        }
        System.out.println("Wages for a month: "+totalWage);
    }

}

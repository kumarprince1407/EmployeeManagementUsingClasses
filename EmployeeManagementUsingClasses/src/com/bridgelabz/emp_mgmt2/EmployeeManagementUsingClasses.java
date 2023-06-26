package com.bridgelabz.emp_mgmt2;

import java.util.Random;

public class EmployeeManagementUsingClasses {
    private static final  int empWagePerHr=20;
    private static final int fullDayHr = 8;
    private static final int partTimeHour =4;
    private static final int maxWorkingDays = 20;
    private static final int maxWorkingHours=100;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Management using classes.");
        System.out.println();
        calculateEmployeeWage();
    }
    public static void calculateEmployeeWage(){

        Random random = new Random();

        int totalWorkingDays=0;
        int totalWage=0;
        int totalWorkingHours=0;


        while(totalWorkingDays<=maxWorkingDays && totalWorkingHours<=maxWorkingHours) {
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
            totalWorkingDays++;
        }
        System.out.println("Wages for a month: "+totalWage);
    }

}

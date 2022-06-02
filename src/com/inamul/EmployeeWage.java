package com.inamul;

public class EmployeeWage {
    public static void company1() {
        int empWage = 0;
        int Wage_Per_Hr = 20;
        int emphrs = 0;
        int Max_Working_Day = 20;
        int day = 0;
        int totalWage = 0;
        int Total_Working_Hour = 0;
        int Max_Working_Hour = 100;

        while (day < Max_Working_Day && Total_Working_Hour<Max_Working_Hour) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3 + 1;
            switch (empCheck) {
                case 1:
                    emphrs = 8;
                    System.out.println("Employee of company1 is present full time");
                    day++;
                    break;
                case 2:
                    emphrs = 4;
                    System.out.println("Employee of company1 is present part time");
                    day++;
                    break;
                case 3:
                    emphrs = 0;
                    System.out.println("Employee of company1 is absent");
                    break;
            }
            Total_Working_Hour = Total_Working_Hour + emphrs;
            totalWage = Wage_Per_Hr * Total_Working_Hour;
        }
        System.out.println("Monthly wage of the employee is: "+totalWage);
        System.out.println("Total days worked: "+day);
        System.out.println("Total hours worked: "+Total_Working_Hour);
    }

    public static void company2() {
        int empWage = 0;
        int Wage_Per_Hr = 18;
        int emphrs = 0;
        int Max_Working_Day = 24;
        int day = 0;
        int totalWage = 0;
        int Total_Working_Hour = 0;
        int Max_Working_Hour = 192;

        while (day < Max_Working_Day && Total_Working_Hour<Max_Working_Hour) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3 + 1;
            if (empCheck == 1) {
                System.out.println("Employee of company2 is present full time");
                emphrs = 8;
                day++;
            } else if (empCheck == 2) {
                System.out.println("Employee of company2 is present part time");
                emphrs = 4;
                day++;
            }else {
                System.out.println("Employee of company2 is absent");
            }
            Total_Working_Hour = Total_Working_Hour + emphrs;
            totalWage = Wage_Per_Hr * Total_Working_Hour;
        }
        System.out.println("Monthly wage of the employee is: "+totalWage);
        System.out.println("Total days worked: "+day);
        System.out.println("Total hours worked: "+Total_Working_Hour);
    }

    public static void main(String[] args) {
        System.out.println("Using class method.");
        EmployeeWage.company1();
        EmployeeWage.company2();
    }
}


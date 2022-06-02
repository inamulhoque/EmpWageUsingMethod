package com.inamul;

public class EmployeeWage {
    public static void employee() {
        int empWage = 0;
        int Wage_Per_Hr = 20;
        int emphrs = 0;
        int Max_Working_Day = 20;
        int day = 0;
        int totalWage = 0;
        int Total_Working_Hour = 0;

        while (day < Max_Working_Day) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3 + 1;
            switch (empCheck) {
                case 1:
                    emphrs = 8;
                    break;
                case 2:
                    emphrs = 4;
                    break;
                case 3:
                    emphrs = 0;
                    break;
            }
            day++;
            Total_Working_Hour = Total_Working_Hour + emphrs;
            totalWage = Wage_Per_Hr * Total_Working_Hour;
        }
        System.out.println("Monthly wage of the employee is: "+totalWage);
    }
    public static void main(String[] args) {
        EmployeeWage.employee();
    }
}


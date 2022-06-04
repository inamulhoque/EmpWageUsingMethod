package com.inamul;

public class EmployeeWage {
        public static int CalculateEmpWage(String company, int empRate, int maxDays, int maxHours) {
            int day = 0;
            int totalWage = 0;
            int emphrs = 0;
            int Total_Working_Hour = 0;

            while (day < maxDays && Total_Working_Hour < maxHours) {
                int empCheck = (int) Math.floor(Math.random() * 10) % 2 + 1;
                day++;
                switch (empCheck) {
                    case 1:
                        emphrs = 8;
                        break;
                    case 2:
                        emphrs = 4;
                        break;
                    default:
                        emphrs = 0;
                        break;
                }
                Total_Working_Hour = Total_Working_Hour + emphrs;
                totalWage = empRate * Total_Working_Hour;
            }
            System.out.println("Monthly wage of the employee of "+company+" is: "+ totalWage);
            System.out.println("Total days worked: " + day);
            System.out.println("Total hours worked: " + Total_Working_Hour);

            return totalWage;
        }

    public static void main(String[] args) {
        CalculateEmpWage("Infosys",22,24,120);
        CalculateEmpWage("TCS",20,22,110);
    }
}


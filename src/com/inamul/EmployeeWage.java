package com.inamul;

public class EmployeeWage {
    public static void employee() {
        int empWage = 0;
        int Wage_Per_Hr = 20;
        int emphrs = 0;

        int empCheck = (int) Math.floor(Math.random() * 10) % 3 + 1;
        switch (empCheck) {
            case 1:
                System.out.println("Employee is present full time");
                emphrs = 8;
                break;
            case 2:
                System.out.println("Employee is present part time");
                emphrs = 4;
                break;
            case 3:
                System.out.println("Employee is absent");
                emphrs = 0;
                break;
        }
        empWage = Wage_Per_Hr * emphrs;
        System.out.println("Daily wage is: " + "$" + empWage);
    }
    public static void main(String[] args) {
        EmployeeWage.employee();
    }
}


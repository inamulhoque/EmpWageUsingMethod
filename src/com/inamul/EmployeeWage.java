package com.inamul;

public class EmployeeWage {
    public static void employee(){
        int empWage =0;
        int Wage_Per_Hr = 20;
        int emphrs=0;

        int empCheck = (int) Math.floor(Math.random() * 10) % 3+1;
        if (empCheck == 1){
            System.out.println("Employee is absent.");
        } else if (empCheck == 2) {
            System.out.println("Employee present part time.");
            emphrs=4;
        } else {
            System.out.println("Employee is present.");
            emphrs=8;
        }
        empWage = Wage_Per_Hr*emphrs;
        System.out.println("Daily wage is: "+"$"+empWage);
    }
    public static void main(String[] args) {
        EmployeeWage.employee();
    }
}

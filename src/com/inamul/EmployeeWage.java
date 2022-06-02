package com.inamul;

public class EmployeeWage {
    public static void employee(){
        int empCheck = (int) Math.floor(Math.random() * 10) % 2+1;
        if (empCheck == 1){
            System.out.println("Employee is absent.");
        } else {
            System.out.println("Employee is present.");
        }
    }
    public static void main(String[] args) {
        EmployeeWage.employee();
    }
}

package com.vieba;
import java.util.Scanner;

public class TestMyFCStaff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name : ");
        String name = sc.nextLine();
        System.out.println("Staff ID : ");
        String staffID = sc.nextLine();
        System.out.println("Hours Work : ");
        double hoursWork = sc.nextDouble();
        System.out.println("Total Sale : ");
        double totalSale = sc.nextDouble();


        MyFCStaff staff = new MyFCStaff(name, staffID, hoursWork, totalSale);

        staff.displaySalary();
    } 
        
    }

class MyFCStaff {
    private String name, staffID;
    private double hoursWork, totalSale,comission, totalSalary;
    MyFCStaff(String inputName, String inputStaffID, double inputHoursWork, double inputTotalSale) {
        this.name = inputName;
        this.staffID = inputStaffID;
        this.hoursWork = inputHoursWork;
        this.totalSale = inputTotalSale;
    }

    public double calculateComission(){
        
        if (150 <= totalSale && 300 >= totalSale ) {
            comission = 0.05 * totalSale;
        } 

        else if (301 <= totalSale && 500 >= totalSale){
            comission = 0.1 * totalSale;
        }

        else if (500 < totalSale ) {
            comission = 0.15 * totalSale;
        }
        
        else {
            comission = 0;
        }
        
        return comission;

    }

    public double calculateSalary(){
        totalSalary = hoursWork * 8 + calculateComission();

        return totalSalary;
    }

    public void displaySalary(){
        System.out.println("Staff Name     : " + name);
        System.out.println("StaffID        : " + staffID);
        System.out.println("Hours Work     : " + hoursWork);
        System.out.println("Total Sale     : " + totalSale);
        System.out.println("Total Salary   : " + calculateSalary());
        
    
    }
}
package com.vieba;
import java.util.Scanner;

public class TestMyFCStaffNo4 {
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


        MyFCStaff1 staff = new MyFCStaff1(name, staffID, hoursWork, totalSale);
        staff.calculateComission();
        staff.calculateSalary();
        System.out.println( staff.toString());
    } 
        
    }

class MyFCStaff1 {
    private String name, staffID;
    private double hoursWork, totalSale,comission, totalSalary;
    MyFCStaff1(String inputName, String inputStaffID, double inputHoursWork, double inputTotalSale) {
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

    public String toString(){
        return
        "Staff Name     : " + name + "\n" +
        "StaffID        : " + staffID + "\n" +
        "Hours Work     : " + hoursWork + "\n" +
        "Total Sale     : " + totalSale + "\n" +
        "Total Salary   : " + calculateSalary();
        
    
    }
}
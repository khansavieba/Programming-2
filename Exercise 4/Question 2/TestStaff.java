package com.vieba;

import java.util.Scanner;



class TestStaff {
	static Scanner console = new Scanner(System.in);	
    public static void main(String args[]){
        System.out.println("Enter Name : ");
        String name = console.nextLine();
        System.out.println("Enter ID : ");
        String staffID = console.nextLine();
        System.out.println("Enter Working Days : ");
        int workingDay = console.nextInt();

        Staff employee = new Staff();
        employee.setStaffInfo(name, staffID, workingDay);
        employee.calculateSalary();

   // System.out.printf(%, args)
        System.out.printf("%-15s%-5s%s\n", "Name ", ": ", employee.getName());
        System.out.printf("%-15s%-5s%s\n", "Staff ID ", ": ", employee.getStaffID());
        System.out.printf("%-15s%-5s%.2f\n", "Working Day ", ": ", employee.getSalary());
}
}


class Staff1 {
	private String name, staffID;
	private double salary;
	private int workingDay;
	public void setStaffInfo(String nm, String id, int wDay){
		name=nm;
        staffID=id;
        workingDay=wDay;
	}
	public void calculateSalary(){
		salary = workingDay * 35.0;
	}
	public double getSalary(){
		return salary;
	}
	public String getName(){
		return name;
	}
	public String getStaffID(){
		return staffID;
    }

}//end class







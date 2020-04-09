package com.vieba;
import java.util.Scanner; 

public class PayrollDemo {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.input();

        Payroll payroll1 = new Payroll();
        payroll1.calculateNetPay(employee1);
        payroll1.printOutput();
    }
}

class Employee {
        
    String employeeIDnumber;
    double grossPay, stateTax, federalTax;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID Number : ");
        employeeIDnumber = sc.nextLine();
        System.out.println("Enter Gross Pay : ");
        grossPay = sc.nextDouble();
        System.out.println("Enter State Tax :");
        stateTax = sc.nextDouble();
        System.out.println("Enter Federal Tax : ");
        federalTax = sc.nextDouble();
    }

    public String getEmployeeIDNumber() {
        return employeeIDnumber;
    }

    public double getGrossPay(){
        return grossPay;
    }

    public double getStateTax(){
        return stateTax;
    }

    public double getFederalTax(){
        return federalTax;
    }
}

class Payroll{
    private double netPay;

    public double calculateNetPay(Employee employee1){
        netPay = employee1.getGrossPay()-employee1.getStateTax()-employee1.getFederalTax();
        return netPay;
    }

    public void printOutput(){
        System.out.println("Net pay is : RM " + netPay);
    }

}




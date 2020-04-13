package com.vieba;
import java.util.Scanner;

public class Average{
    public static void main(String[] args) { 
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        a = input.nextInt();
        System.out.println("Enter second number : ");
        b = input.nextInt();
        System.out.println("Enter third number : ");
        c = input.nextInt();

        System.out.println("\n \tAverage");
        System.out.println("One number      : " + average(a));
        System.out.println("Two numbers     : " + average(a, b));
        System.out.println("Three numbers   : " +average(a, b, c));
    }

    public static double average(int int1){
        return (double)int1;
    }

    public static double average(int int1, int int2){
        return (int1+int2)/2.0;
    }

    public static double average(int int1, int int2, int int3){
        return (int1+int2+int3)/3.0;
    }
}
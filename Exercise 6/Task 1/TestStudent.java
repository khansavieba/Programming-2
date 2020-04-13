package com.vieba;

import java.util.Scanner;
public class TestStudent {  
public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
String matricNo;
	double test1,test2;
	
	Student [] studDegree = new Student[3];
    //complete your code here
    for(int i = 0; i < studDegree.length ; i++){
    System.out.println("Matric No : ");
    matricNo = input.next() + input.nextLine();
    System.out.println("Test 1 : ");
    test1 = input.nextDouble();
    System.out.println("Test 2 : ");
    test2 = input.nextDouble(); 
    studDegree[i] = new Student(matricNo, test1, test2);
    }

    System.out.println("\t*****************************\n\t     STUDENT INFORMATION\n\t*****************************");
    System.out.println("\tMatric No\tAverage Mark");

    for(int j = 0; j <= studDegree.length; j++){
        studDegree[j].calculateAverage();
        System.out.println(studDegree[j].getStudentInfo());

    }
    
  }//end of main method
}//end of class TestStudent


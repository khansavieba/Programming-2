package com.vieba;

import  java.util.Scanner;
public class TriangleDemo
{
   public static void main(String[] args)
   {
      //create a Scanner object
      Scanner sc = new Scanner(System.in);

      // Create a Triangle object.
      Triangle one = new Triangle();

      // Prompt user to input value for height and base                 
      System.out.println("Enter Triangle Height : ");     
      double height = sc.nextDouble();     
      System.out.println("Enter Triangle Base : ");      
      double base = sc.nextDouble();
      //Set the height and base (use mutator) 
      one.setBase(base);
      one.setHeight(height);
      // Display the height, base and area (use accessor)
      System.out.println("The pyramid's height is "
                         + one.getHeight());
      System.out.println("The pyramid's base is "
                         + one.getBase());
      
     System.out.println("The pyramid's area is "
                         + one.getArea());
      
   }
}


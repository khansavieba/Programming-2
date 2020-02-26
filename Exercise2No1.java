import java.lang.Math;
import java.util.*;
public class Exercise2No1 {
   public static void main (String args[]){
   Scanner sc1 = new Scanner(System.in);
   System.out.println("Enter a number: ");
   double num = sc1.nextDouble(); //assign user's input into double 
   double square = Math.pow(num,2); //calculate the number to the power of 2 
   double cube = Math.pow(num,3); //calculate the number to the power of 3 
   System.out.printf("%-15s%-15s%-15s","Number","Square","Cube");
   System.out.printf("\n%-15s%-15s%-15s",num,square,cube);

   }

}
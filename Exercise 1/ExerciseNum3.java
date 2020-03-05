import java.util.*;
public class ExerciseNum4 {
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter 4-digit number : "); //asking for user input 
   String number = sc.nextLine(); //assigning user input into variable number 
   String number1; 
   int sum = 0;
   
      for(int i = 0; i<number.length() ; i++){
         System.out.println(number.charAt(i)); //printing number line by line 
         number1 = String.valueOf(number.charAt(i)); //convert character to string 
         sum = sum + Integer.parseInt(number1);   //initialize and calculating the total 
         }
   
   
   System.out.println("The total of the digits = " + sum ); //print the total 
 
   
   
   }

}

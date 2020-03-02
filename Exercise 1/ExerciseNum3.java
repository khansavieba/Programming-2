import java.util.*;
public class ExerciseNum3 {
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter 4-digit number : ");
   String number = sc.nextLine();
   for(int i = 0; i<4 ; i++){
   System.out.println(number.charAt(i));
 
   
   }
   int numberX = Integer.parseInt(number);
   int count = 0;
   while (numberX > 0){
   count += numberX;
   }
   
   System.out.println(count);
 
   
   
   }

}
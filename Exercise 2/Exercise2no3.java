import java.util.*;

public class Exercise2no3 {
     public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a sentence    : "); //asking for user input 
        String sentence = input.nextLine(); //reading user input as a string 
        

        for(int n = sentence.length() - 1; n >= 0 ; n--){
         System.out.print(sentence.charAt(n)); //print in reverse order
  
         }
   }
}

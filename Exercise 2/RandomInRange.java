import java.util.Scanner;
import java.util.Random;
public class RandomInRange {
   public static void main (String args[]){
   
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter first number : ");
   int num1 = sc.nextInt();
   System.out.println("Enter second number : "); 
   int num2 = sc.nextInt();
   
   int random = randomInRange(num1,num2);
   }
   
   public static int randomInRange(int x, int y) {
   Random rand = new Random();
   int random1 = rand.nextInt(y);
  
   
   if (x > y) {
   System.out.print("Random number : 0 \nYour first number should be greater than your second number");
   }//if
   
   else {
   System.out.println("Random number range is from " + x + " to " + y);
   System.out.println("Random number : " + random1);}
   
   return random1;
   }
}

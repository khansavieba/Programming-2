import java.util.*;
public class FunnyString {
   public static void main (String args[]){
   Scanner sc1 = new Scanner(System.in);
   System.out.println("Enter Color : ");
   String color = sc1.nextLine();
   Scanner sc2 = new Scanner(System.in);
   System.out.println("Enter Food : "); 
   String food = sc2.nextLine();
   Scanner sc3 = new Scanner(System.in);
   System.out.println("Enter Animal : ");
   String animal = sc3.nextLine();
   
   System.out.printf("I had a dream that Jack ate a %s %s and said it tasted like %s!",color,food,animal);
   }
}
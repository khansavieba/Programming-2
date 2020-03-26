/**
Write an application that calculates the squares and cubes of the numbers from 0 to 10 and prints the resulting values in a table format, a shown below.
You must use Math class to solve this problem.

Number           Square            Cube 
0                    0               0 
1                    1               1 
2                    4               8   
and so on


**/
import java.lang.Math;
import java.util.*;
public class Exercise2No1 {
   public static void main (String args[]){


   System.out.println("Number\tSquare\tCube");
   
   for(int i=0;i<=10;i++){
          System.out.println(i+"\t\t\t"+(int)Math.pow(i,2)+"\t\t\t"+(int)Math.pow(i,3));
          
   }

}
}

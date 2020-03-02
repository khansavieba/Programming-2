/**
2.	Write a program called CountA that accepts a String parameter and display the number of times the character 'A' is found in the string.
**/
import java.util.Scanner;
public class Exercise2no2{ 

      public static void main(String args[]) 
    { 
        String str= "COLLEGE OF ART AND SCIENCES"; 
        char a = 'A'; 
        System.out.println(str);
        System.out.println("number of time the character 'A' is found : " + countA(str, a)); 
    } 

   
    public static int countA(String cas, char a) 
    { 
        int count = 0; 
  
        for (int i=0; i<cas.length(); i++) 
        { 
            // checking character in string 
            if (cas.charAt(i) == a) 
            count++; 
        }  
        return count; 
    } 
      
   } 
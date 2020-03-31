import java.util.*;
import java.util.Random;
public class Exercise3
   {public static void main(String [] args) {
   
   //Question 1 
   String str = "hello world";
   String str1 = new String ("hello world");

   //Question 2
   String phr = new String("Big,blue sky");
   System.out.println(phr.substring(phr.indexOf(","),7));
   //the output is ,blu 
   
   //Question 3 
   Random rd = new Random();
   System.out.println(rd.nextInt(41) + 10); //the output will generate random number from 10 to 50

   //Question 4 
   Random rand = new Random();
   
   int num1 = rand.nextInt(100);
   int num2 = rand.nextInt(100);
    
   System.out.println(Math.max(num1,num2)); //compare between 2 random numbers 
   
   //Question 5 
   String test = "abc";
   test = test + test;
   System.out.println(test); //the output is abcabc
   
   Random random = new Random();
   double d = Math.round ( 2.5 + random.nextInt(1) );
   System.out.println("The value is " + d); //the output is The value is 3.0

   
   //Question 6
   //a
   Scanner sc = new Scanner(System.in); 
   //b
   System.out.println("Enter the value of x : ");
   int x = sc.nextInt();
   System.out.println("Enter the value of y : ");
   int y = sc.nextInt();
   //c
   System.out.println(Math.pow(x,y));
   
   //Question 7 
   String text1 = "School of Computing";
   String text2 = "College of Arts and Sciences";
   String text3 = "UUM Sintok";
   //a 
   int length1 = (text1+text2+text3).length();
   System.out.println(length1);
   //b 
   System.out.println(text2.substring(0,20) + text1.substring(10,19));
   
   
   }
   
   }
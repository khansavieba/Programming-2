/**
2.	Write a program called CountA that accepts a String parameter and display the number of times the character 'A' is found in the string.
**/
package com.company;

///**
// 2.	Write a program called CountA that accepts a String parameter and display the number of times the character 'A' is found in the string.
// **/
import java.util.Scanner;
public class Exercise2no2{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String str = sc.nextLine();
        char a = 'A';
        char a2 = 'a';
        System.out.println("number of time the character 'A' is found : " + countA(str, a, a2));
    }


    public static int countA(String str, char a, char a2)
    {
        int count = 0;

        for (int i=0; i<str.length(); i++)
        {
            // checking character in string
            if (str.charAt(i) == a)
                count++;
            if (str.charAt(i) == a2)
                count++;
        }
        return count;
    }

}

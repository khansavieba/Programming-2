package com.OOPFruit;

import javax.print.DocFlavor.STRING;

public class Fruit {

//Fruit behaviour in common is they could grow bigger and get rotten 
//I choose 3 type of fruit that is banana, watermelon, and apple 
    static void GrowBigger(){
        System.out.println("Fruit Grows!");
    }

    static void GetRotten(){
        System.out.println("Fruit Expired!");
    }

    void getColour(String colour){
        System.out.println(colour);
    }

    //set weight in Integer
    static void setWeight(int weight){
        System.out.println("Fruit weight : " + weight);
    }

    //OVERLOADING 
    //OVERLOADING set weight in Double
    static void setWeight(double weight){
        System.out.println("Fruit weight : " + weight);
    }

    //OVERLOADING 
    //OVERLOADING set weight in String
    //so user can type the weight in letters instead of numbers
    static void setWeight(String weight){
        System.out.println("Fruit weight : " + weight);
    }
    
    /***this overloading purpose is to make the user be able to 
    type the weight in any type (String, Integer, or Double)
    ***/
}
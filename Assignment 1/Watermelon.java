package com.OOPFruit;

public class Watermelon extends Fruit{

    //ENCAPSULATION using getter and setter
    private static double diameter;
    private static String shape;

    public void setDiameter(double diameter){
        //Accessing variable in class
        this.diameter = diameter; 
    }

    public static double getDiameter(){
        return diameter; 
    }

    public void setShape(String shape){
        //Acessing variable in class
        this.shape = shape;
    }
    
    public static String getShape(){
        return shape;
    }

    public static void cutWatermelon(){
        System.out.println("Watermelon Cut!");
    }

    @Override
    //OVERRIDING getColour method in super class  
    //this method will override the method getColour in fruit class(parents class)
    void getColour(String colour){ 
        System.out.println("Green");
    }

}
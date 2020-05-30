package com.OOPFruit;

//using ABSTRACT class 
abstract class Apple extends Fruit { 

    public abstract void composition();
    //the method has not implemented yet since this is an abstract class
    public static void ContainAntioxidant(){
        System.out.println("Apple Contain Antioxidant");
    }
}

//making another type/child of Apple to implement the abstract method
class FujiApple extends Apple { 

    public void composition(){
        //defining composition method because it has not implemented previously 
        System.out.println("Vitamin B and A");
    }

}
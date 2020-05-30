package com.OOPFruit;

public class Main {
    public static void main(String[] args) {
       
        Banana banana1 = new Banana();
        banana1.GetRotten();
        banana1.PeelBanana();
        banana1.getColour("Yellow");

        Watermelon watermelon1 = new Watermelon();
        watermelon1.cutWatermelon();
        watermelon1.setShape("round");
        watermelon1.getShape();
        
        FujiApple apple1 = new FujiApple();
        apple1.composition();
        apple1.getColour("Red");
        apple1.setWeight(0.5);//double value (overloading)
        apple1.setWeight(1);//integer value (overloading)
        apple1.ContainAntioxidant();
        
    }


}
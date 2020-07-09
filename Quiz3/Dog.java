package com.Quiz3;

public class Dog extends Animal{
    
    String dog;

    public Dog(String dog){
        this.dog = dog;
    }
    public void introduceYourself(){
        System.out.println("Woof. I am a dog. My name is " + dog);
        System.out.println("and I am " + this.age + " years old.");
    }
}
package com.Quiz3;

public class Cat extends Animal {
    String cat;

    public Cat(String cat){
        this.cat = cat;
    }
    public void introduceYourself() {
        System.out.println("Meow. I am a cat. My name is " + this.cat);
        System.out.println("and I am " + this.age + " years old.");
    }
}
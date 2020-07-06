# Answer

**1.Output :**

 Meow. I am a cat. My name is Kurre

 Woof. I am a dog. My name is Vilma

 Meow. I am a cat. My name is Bamse



**2.What is meant by polymorphism ?**

 Polymorphism is the ability of an object to take on many forms.



**3.How does polymorphism work in the above program?**

 when in the class Lab1Stage1 we call method introduceYourself(), but it won't run the method in the parents class. Instead, it will run the method introduceYourself() in each class



**4.The method introduceYourself of Animal appears to be never called? Why not?**

 because the method introduceYourself() in class dog and cat will override the method introduceYourself() in the class Animal/parent class.



**5.Comment out the method introduceYourself in Dog. What happens now when you run the program?**

 the output will be :
 Meow. I am a cat. My name is Kurre

 Morr. I am an animal.

 Meow. I am a cat. My name is Bamse

 now it run the method introduceYourself() from the animal class, since dog class has no introduceYourself() method anymore



**6.Where is the name stored for the instances of Cat and Dog? (In what / which classes did you put the instance variable that refers to the name of the animal? Both Cat and Dog, or just in Animal?)**

 Both class. I put the instance variable of name in both cat and dog class.


**7.How does the code in the test program work?**

 First it made an array called allAnimals and set the array size to 3.

 Then fill the array with calling dog and cat classes with their name in the constructor. 

 initialize integer i to zero

 while i is less than the length of allAnimals array, it will call the method introduceYourself() in each animal child class in array. then Add +1 to i.

 repeat until value of i is greater than the length of the allAnimals array. then stop.



**8.In the above programs we have used a while loop to step through the array and to get information about the animals. But there is a more appropriate loop statement here. What is it?**

 for loop. 

 for(int i = 0 ; i < allAnimals.length ; i++){
}

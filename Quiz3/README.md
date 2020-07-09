# Answer

### What will be printed?

![quiz3](https://user-images.githubusercontent.com/61281276/87006640-9b017880-c1f3-11ea-8f14-039c63625b70.PNG)

### Explain how it is that the instance variable age of Animal can be used in Cat and Dog when it is declared in Animal.

because class Cat and Dog inherit/extends from animal. So both class will have the instance of the Animal class.

### What actually consists an instance of?
Instance variables are not shared between the objects of a class. Each instance will have their own copy of instance variables.

### And what consists a class of?
A class contain a blueprint or a template for creating different objects which defines its properties and behaviors. A class can consist of fields and methods to describe the behavior of an object.


### What is the difference between a class and an instance? 
Class variables, also called as static variables, are declared with the keyword static.

Instance variables, also called as non-static variables are declared without static keyword.

### Change the declaration of the instance variable age of Animal to a class variable using static, in this way:
### public static int age; What is the result of the output now? Why?

![Quiz3 3](https://user-images.githubusercontent.com/61281276/87008305-22e88200-c1f6-11ea-8d82-7cc671b022a4.PNG)

the output is different because The static field Animal.age should be accessed in a static way. Now the static field is belongs to Animal so the result for both age is 3.

### Where is the value of an instance variable stored?
it will be stored in the class itself where the variable was defined

### Where is the value of a class variable stored?
it will be stored inside a property of the class objects. in this case, the class variable age will be stored in an Animal instance.

### What refers the variable this to?
The keyword this refers to the variable in the class. If two variables have the same name are used, this keyword will make sure the current class version of the two will be used.

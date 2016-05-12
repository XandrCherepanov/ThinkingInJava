# Initialization & Cleanup

**Exercise 1: (1)** Create a class containing an uninitialized **String**
reference. Demonstrate that this reference is initialized by Java to null.
**Answer: [ReferenceInitialization.java](src/main/java/ReferenceInitialization.java)**

**Exercise 2: (2)** Create a class with a **String** field that 
is initialized at the point of definition, and another one that 
is initialized by the constructor. What is the difference between the two approaches?
**Answer: [InitializationTest.java](src/main/java/InitializationTest.java)**

**Exercise 3: (1)** Create a class with a default constructor (one that 
takes no arguments) that prints a message. Create an object of this class.
**Answer: [NoArgsConstructor.java](src/main/java/NoArgsConstructor.java)**

**Exercise 4: (1)** Add an overloaded constructor to the previous exercise 
that takes a String argument and prints it along with your message.
**Answer: [OverloadedConstructor.java](src/main/java/OverloadedConstructor.java)**

**Exercise 5: (2)** Create a class called **Dog** with an overloaded 
**bark()** method. This method should be overloaded based on various 
primitive data types, and print different types of barking, howling, etc., 
depending on which overloaded version is called. Write a **main()** 
that calls all the different versions.
**Answer: [Dog.java](src/main/java/Dog.java)**

**Exercise 6: (1)** Modify the previous exercise so that two of the 
overloaded methods have two arguments (of two different types), but 
in reversed order relative to each other. Verify that this works.
**Answer: [Dog2.java](src/main/java/Dog2.java)**

**Exercise 7: (1)** Create a class without a constructor, and then 
create an object of that class in **main()** to verify that 
the default constructor is automatically synthesized.
**Answer: [DefaultConstructor.java](src/main/java/DefaultConstructor.java)**

**Exercise 8: (1)** Create a class with two methods. Within the first method, 
call the second method twice: the first time without using **this**, 
and the second time using **this**—just to see it working; 
you should not use this form in practice.
**Answer: [Apricot.java](src/main/java/Apricot.java)**

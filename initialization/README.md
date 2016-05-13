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

**Exercise 9: (1)** Create a class with two (overloaded) constructors. 
Using **this**, call the second constructor inside the first one.
**Answer: [Flower.java](src/main/java/Flower.java)**

**Exercise 10: (2)** Create a class with a **finalize()** method 
that prints a message. In **main()**, create an object of your class. 
Explain the behavior of your program.
**Answer: [Finalize.java](src/main/java/Finalize.java)**

**Exercise 11: (4)** Modify the previous exercise so that your **finalize()** 
will always be called.
**Answer: [Finalize2.java](src/main/java/Finalize2.java)**

**Exercise 12: (4)** Create a class called **Tank** that can be filled 
and emptied, and has a _termination condition_ that it must be empty 
when the object is cleaned up. Write a **finalize()** that verifies 
this termination condition. In **main()**, test the possible scenarios 
that can occur when your **Tank** is used.
**Answer: [TerminationCondition.java](src/main/java/TerminationCondition.java)**

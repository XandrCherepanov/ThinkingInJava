# Access Control

**Exercise 1: (1)** Create a class in a package. 
Create an instance of your class outside of that package.
**Answer: [ImportedMyClass.java](src/main/java/ImportedMyClass.java), 
[mypackage/MyClass.java](src/main/java/mypackage/MyClass.java)**

**Exercise 2: (1)** Take the code fragments in this section and turn 
them into a program, and verify that collisions do in fact occur.
**Answer: [Collisions.java](src/main/java/Collisions.java), 
[net/mindview/simple/Vector.java](src/main/java/net/mindview/simple/Vector.java)**

**Exercise 3: (2)** Create two packages: **debug** and **debugoff**, 
containing an identical class with a **debug()** method. The first 
version displays its **String** argument to the console, the second 
does nothing. Use a **static import** line to import the class into a 
test program, and demonstrate the conditional compilation effect.
**Answer: [ConditionalCompilation.java](src/main/java/ConditionalCompilation.java), 
[debug/Debug.java](src/main/java/debug/Debug.java),
[debugoff/Debug.java](src/main/java/debugoff/Debug.java)**

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

**Exercise 4: (2)** Show that **protected** methods have package 
access but are not **public**.
**Answer: [cookie/Cookie.java](src/main/java/cookie/Cookie.java), 
[cookie/CookiePackageTest.java](src/main/java/cookie/CookiePackageTest.java),
[CookieOutPackageTest.java](src/main/java/CookieOutPackageTest.java)**

**Exercise 5: (2)** Create a class with **public**, **private**, **protected**, 
and package-access fields and method members. Create an object of this 
class and see what kind of compiler messages you get when you try to 
access all the class members. Be aware that classes in the same directory 
are part of the “default” package.
**Answer: [AccessMembers.java](src/main/java/AccessMembers.java), 
[AccessMembersTest.java](src/main/java/AccessMembersTest.java)**

**Exercise 6: (1)** Create a class with **protected** data. Create a second 
class in the same file with a method that manipulates the **protected** 
data in the first class.
**Answer: [ProtectedDataTest.java](src/main/java/ProtectedDataTest.java)**

**Exercise 7: (1)** Create the library according to the code fragments 
describing **access** and **Widget**. Create a **Widget** in a class 
that is not part of the **access** package.
**Answer: [WidgetTest.java](src/main/java/WidgetTest.java), 
[access/Widget.java](src/main/java/access/Widget.java)**

**Exercise 8: (4)** Following the form of the example **Lunch.java**, 
create a class called **ConnectionManager** that manages a fixed array 
of **Connection** objects. The client programmer must not be able to 
explicitly create **Connection** objects, but can only get them via a 
**static** method in **ConnectionManager**. When the **ConnectionManager** 
runs out of objects, it returns a **null** reference. 
Test the classes in **main()**.
**Answer: [access/Connection.java](src/main/java/access/Connection.java), 
[access/ConnectionManager.java](src/main/java/access/ConnectionManager.java),
[ConnectionsTest.java](src/main/java/ConnectionsTest.java)**

**Exercise 9: (2)** Create two files in the **access/local** 
directory (presumably in your CLASSPATH) and in a directory other 
than **access/local**. Explain why the compiler generates an error. 
Would making the **Foreign** class part of the **access.local** package change anything?
**Answer: [access/local/PackagedClass.java](src/main/java/access/local/PackagedClass.java), 
[access/foreign/Foreign.java](src/main/java/access/foreign/Foreign.java)**

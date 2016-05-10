# Controlling Execution

**Exercise 1: (1)** Write a program that prints values from 1 to 100.
**Answer: [OneHundred.java](src/main/java/OneHundred.java)**

**Exercise 2: (2)** Write a program that generates 25 random **int** values. 
For each value, use an **if-else** statement to classify it as greater than, 
less than, or equal to a second randomly generated value.
**Answer: [IfElseRandom.java](src/main/java/IfElseRandom.java)**

**Exercise 3: (1)** Modify Exercise 2 so that your code is surrounded 
by an “infinite” **while** loop. It will then run until you interrupt 
it from the keyboard (typically by pressing Control-C).
**Answer: [InfiniteWhile.java](src/main/java/InfiniteWhile.java)**

**Exercise 4: (3)** Write a program that uses two nested **for** loops 
and the modulus operator (**%**) to detect and print prime numbers 
(integral numbers that are not evenly divisible by any other numbers 
except for themselves and 1).
**Answer: [PrimeNumbers.java](src/main/java/PrimeNumbers.java)**

**Exercise 5: (4)** Repeat Exercise 10 from the previous chapter, 
using the ternary operator and a bitwise test to display the ones 
and zeroes, instead of **Integer.toBinaryString()**.
**Answer: [BitwiseOperators.java](src/main/java/BitwiseOperators.java)**

**Exercise 6: (2)** Modify the two **test()** methods in the previous
two programs so that they take two extra arguments, **begin** and **end**,
and so that **testval** is tested to see if it is within the range 
between (and including) **begin** and **end**.
**Answer: [IfElse.java](src/main/java/IfElse.java)**

**Exercise 7: (1)** Modify Exercise 1 so that the program exits 
by using the **break** keyword at value 99. Try using **return** instead.
**Answer: [OneHundred1.java](src/main/java/OneHundred1.java)**

**Exercise 8: (2)** Create a **switch** statement that prints a message 
for each **case**, and put the **switch** inside a **for** loop that 
tries each **case**. Put a **break** after each **case** and test it, 
then remove the **break**s and see what happens.
**Answer: [SwitchTest.java](src/main/java/SwitchTest.java)**

**Exercise 9: (4)** A _Fibonacci_ sequence is the sequence of numbers 
1, 1, 2, 3, 5, 8, 13, 21, 34, and so on, where each number (from 
the third on) is the sum of the previous two. Create a method that 
takes an integer as an argument and displays that many Fibonacci numbers 
starting from the beginning, e.g., If you run **java Fibonacci 5** 
(where **Fibonacci** is the name of the class) the output will be: 1, 1, 2, 3, 5.
**Answer: [Fibonacci.java](src/main/java/Fibonacci.java)**

**Exercise 10: (5)** A _vampire_ number has an even number of digits 
and is formed by multiplying a pair of numbers containing half the number 
of digits of the result. The digits are taken from the original number 
in any order. Pairs of trailing zeroes are not allowed. Examples include:

1260 = 21 * 60
1827 = 21 * 87
2187 = 27 * 81

Write a program that finds all the 4-digit vampire numbers.


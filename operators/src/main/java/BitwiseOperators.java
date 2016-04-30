/**
 * Exercise 10: (3) Write a program with two constant values, one with
 * alternating binary ones and zeroes, with a zero in the least-significant
 * digit, and the second, also alternating, with a one in the least-significant digit
 * (hint: It’s easiest to use hexadecimal constants for this).
 * Take these two values and combine them in all possible ways using
 * the bitwise operators, and display the results using Integer.toBinaryString().
 */

import static net.mindview.util.Print.*;

public class BitwiseOperators {
    public static void main(String[] args) {
        int first = 0xaaaaaaaa;
        int second = 0x55555555;
        print("First number: " + Integer.toBinaryString(first));
        print("Second number: " + Integer.toBinaryString(second));

        print();
        print("Bitwise Operations:");
        print("~first: " + Integer.toBinaryString(~first));
        print("~second: " + Integer.toBinaryString(~second));
        print("first & second: " + Integer.toBinaryString(first & second));
        print("first | second: " + Integer.toBinaryString(first | second));
        print("first ^ second: " + Integer.toBinaryString(first ^ second));
    }
}

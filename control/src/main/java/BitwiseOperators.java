/**
 * Exercise 5: (4) Repeat Exercise 10 from the previous chapter,
 * using the ternary operator and a bitwise test to display the ones
 * and zeroes, instead of Integer.toBinaryString().
 */

import static net.mindview.util.Print.*;

public class BitwiseOperators {
    public static String showBinary(int number) {
        String result = "";

        int count = 32;
        for (int i = 0x80000000; count > 0; i >>>= 1, count--) {
            result += ((number & i) == 0) ? "0" : "1";
        }

        return result;
    }

    public static void main(String[] args) {
        int first = 0xaaaaaaaa;
        int second = 0x55555555;
        print("First number: " + showBinary(first));
        print("Second number: " + showBinary(second));

        print();
        print("Bitwise Operations:");
        print("~first: " + showBinary(~first));
        print("~second: " + showBinary(~second));
        print("first & second: " + showBinary(first & second));
        print("first | second: " + showBinary(first | second));
        print("first ^ second: " + showBinary(first ^ second));
    }
}

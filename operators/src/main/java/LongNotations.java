/**
 * Exercise 8: (2) Show that hex and octal notations work with long values.
 * Use Long.toBinaryString() to display the results.
 */

import static net.mindview.util.Print.*;

public class LongNotations {
    public static void main(String[] args) {
        long n1 = 0x23fL;    // Hexadecimal (lowercase)
        print("n1: " + Long.toBinaryString(n1));
        long n2 = 0x23FL;    // Hexadecimal (uppercase)
        print("n2: " + Long.toBinaryString(n2));
        long n3 = 01767L;    // Octal
        print("n3: " + Long.toBinaryString(n3));
    }
}

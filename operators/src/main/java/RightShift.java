/**
 * Exercise 11: (3) Start with a number that has a binary one in the
 * most significant position (hint: Use a hexadecimal constant). Using
 * the signed right-shift operator, right shift it all the way through
 * all of its binary positions, each time displaying the result using
 * Integer.toBinaryString().
 */

public class RightShift {
    public static void main(String[] args) {
        int i = 0x80000000;
        System.out.println("i: \t\t\t" + Integer.toBinaryString(i));
        for (int j = 1; j < 32; j++) {
            i >>= 1;
            System.out.println("i >> " + j + ": \t" + Integer.toBinaryString(i));
        }
    }
}

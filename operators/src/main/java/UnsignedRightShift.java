/**
 * Exercise 12: (3) Start with a number that is all binary ones.
 * Left shift it, then use the unsigned right-shift operator to right
 * shift through all of its binary positions, each time displaying the
 * result using Integer.toBinaryString().
 */

public class UnsignedRightShift {
    public static void main(String[] args) {
        int i = 0xffffffff;
        System.out.println("i: \t\t\t" + Integer.toBinaryString(i));
        i <<= 1;
        System.out.println("i << 1: \t" + Integer.toBinaryString(i));
        for (int j = 1; j < 33; j++) {
            i >>>= 1;
            System.out.println("i >>> " + j + ": \t" + Integer.toBinaryString(i));
        }
    }
}

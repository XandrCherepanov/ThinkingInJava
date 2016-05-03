/**
 * Exercise 13: (1) Write a method that displays char values
 * in binary form. Demonstrate it using several different characters.
 */

public class CharBinary {
    public static void printBinaryChar(String s, char ch) {
        System.out.println(s + ", char: " + ch + ", binary:\n    " +
            Integer.toBinaryString(ch));
    }

    public static void main(String[] args) {
        printBinaryChar("'a'", 'a');
        printBinaryChar("'2'", '2');
        printBinaryChar("'б'", 'б');
        printBinaryChar("'\uf222'", (char) 0xf222);
    }
}

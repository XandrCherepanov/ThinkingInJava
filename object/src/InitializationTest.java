/**
 * Exercise 1: (2) Create a class containing an int and a char that are not initialized,
 * and print their values to verify that Java performs default initialization.
 */
public class InitializationTest {

    public static int integer;
    public static char character;

    public static void main(String[] args) {
        System.out.println("Initial value of integer = " + integer);
        System.out.println("Initial value of character = " + character);
    }
}

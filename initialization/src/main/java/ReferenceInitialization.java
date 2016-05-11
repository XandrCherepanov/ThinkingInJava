/**
 * Exercise 1: (1) Create a class containing an uninitialized String
 * reference. Demonstrate that this reference is initialized by Java to null.
 */
public class ReferenceInitialization {

    public static String uninitialized;

    public static void main(String[] args) {
        System.out.println("uninitialized = " + uninitialized);
    }
}

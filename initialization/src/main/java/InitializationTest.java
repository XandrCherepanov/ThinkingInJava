/**
 * Exercise 2: (2) Create a class with a String field that
 * is initialized at the point of definition, and another one that
 * is initialized by the constructor. What is the difference between the two approaches?
 */
public class InitializationTest {
    private String initialized = "immediately";
    private String uninitialized;

    public InitializationTest(String value) {
        System.out.println(initialized);
        System.out.println(uninitialized);

        uninitialized = value;

        System.out.println(uninitialized);
    }

    public static void main(String[] args) {
        new InitializationTest("in constructor");
    }
}

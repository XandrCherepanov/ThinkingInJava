/**
 * Exercise 19: (2) Write a method that takes a vararg String array.
 * Verify that you can pass either a comma-separated list of Strings or
 * a String[] into this method.
 */
public class StringVarargs {
    static void printValues(String... values) {
        for (String value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printValues("Hello", "World");
        printValues(new String[]{"Simple", "array", "values"});
        String[] array = {"Another", "simple", "array"};
        printValues(array);
    }
}

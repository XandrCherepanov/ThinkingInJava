/**
 * Exercise 10: (2) Create a class with a finalize() method
 * that prints a message. In main(), create an object of your class.
 * Explain the behavior of your program.
 */
public class Finalize {
    /**
     * Calling this method is not guaranteed!
     */
    @Override
    protected void finalize() {
        System.out.println("finalize() method called");
    }

    public static void main(String[] args) {
        new Finalize();
    }
}

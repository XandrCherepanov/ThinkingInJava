/**
 * Exercise 11: (4) Modify the previous exercise so that your finalize()
 * will always be called.
 */
public class Finalize2 {
    /**
     * Calling this method is not guaranteed!
     */
    @Override
    protected void finalize() {
        System.out.println("finalize() method called");
    }

    public static void main(String[] args) {
        new Finalize2();
        System.runFinalization();
        System.gc();    // call garbage collector
    }
}

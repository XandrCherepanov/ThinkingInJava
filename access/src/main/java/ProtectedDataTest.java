/**
 * Exercise 6: (1) Create a class with protected data. Create a second
 * class in the same file with a method that manipulates the protected
 * data in the first class.
 */
class SimpleData {
    protected int someValue = 0;
}

public class ProtectedDataTest {
    public static void main(String[] args) {
        SimpleData sd = new SimpleData();
        System.out.println(sd.someValue);
        sd.someValue = 5;
        System.out.println(sd.someValue);
    }
}

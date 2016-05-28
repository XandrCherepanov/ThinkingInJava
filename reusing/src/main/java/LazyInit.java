/**
 * Exercise 1: (2) Create a simple class. Inside a second class,
 * define a reference to an object of the first class. Use lazy
 * initialization to instantiate this object.
 */
class Lazy {
    String s = "lazy initialization";

    @Override
    public String toString() {
        return s;
    }
}

public class LazyInit {
    Lazy lazyObject;

    public Lazy getLazyObject() {
        if (lazyObject == null)
            lazyObject = new Lazy();
        return lazyObject;
    }

    public static void main(String[] args) {
        System.out.println(new LazyInit().getLazyObject());
    }
}

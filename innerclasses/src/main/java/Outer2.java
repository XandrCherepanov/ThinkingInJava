/**
 * Exercise 3: (1) Modify Exercise 1 so that Outer has a private String field
 * (initialized by the constructor), and Inner has a toString( ) that displays this field.
 * Create an object of type Inner and display it.
 */

public class Outer2 {
    private String value;

    public Outer2(String value) {
        this.value = value;
    }

    class Inner {
        public void func() {
            System.out.println("Inner.func() called");
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer2 outer = new Outer2("Sample String");
        Outer2.Inner inner = outer.inner();
        System.out.println(inner);
    }
}

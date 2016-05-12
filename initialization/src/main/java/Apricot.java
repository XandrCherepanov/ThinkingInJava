/**
 * Exercise 8: (1) Create a class with two methods. Within the first method,
 * call the second method twice: the first time without using this,
 * and the second time using this—just to see it working;
 * you should not use this form in practice.
 */
public class Apricot {
    void pick() {
        System.out.println("Apricot is picked");
    }

    void pit() {
        pick();
        this.pick();
    }

    public static void main(String[] args) {
        new Apricot().pit();
    }
}

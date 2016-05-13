/**
 * Exercise 12: (4) Create a class called Tank that can be filled
 * and emptied, and has a termination condition that it must be empty
 * when the object is cleaned up. Write a finalize() that verifies
 * this termination condition. In main(), test the possible scenarios
 * that can occur when your Tank is used.
 */
class Tank {
    boolean isEmpty = false;

    Tank(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    void fill() {
        isEmpty = false;
    }

    void empty() {
        isEmpty = true;
    }

    @Override
    protected void finalize() throws Throwable {
        if (!isEmpty)
            System.out.println("Error: tank is full");
    }
}

public class TerminationCondition {
    public static void main(String[] args) {
        Tank tank = new Tank(true);
        tank.fill();
        tank.empty();
        tank = null;

        new Tank(false);
        tank = new Tank(true);
        tank.fill();
        tank = null;

        System.gc();
    }
}

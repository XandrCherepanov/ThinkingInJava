/**
 * Exercise 4: (2) Write a program that calculates velocity
 * using a constant distance and a constant time.
 */
public class Velocity {
    public static void main(String[] args) {
        double distance = 50.4;
        double time = 1.2;

        double velocity = distance / time;
        System.out.println("Distance: " + distance + " km");
        System.out.println("Time: " + time + " hours");
        System.out.println("Velocity: " + velocity + " km/h");
    }
}

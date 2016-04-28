/**
 * Exercise 7: (3) Write a program that simulates coin-flipping.
 */

import java.util.Random;
import static net.mindview.util.Print.*;

public class CoinFlipping {
    public static void main(String[] args) {
        Random rnd = new Random();
        if (rnd.nextInt(100) > 50) {
            print("That is head!");
        } else {
            print("That is tail!");
        }
    }
}

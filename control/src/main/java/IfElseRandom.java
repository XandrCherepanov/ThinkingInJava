/**
 * Exercise 2: (2) Write a program that generates 25 random int values.
 * For each value, use an if-else statement to classify it as greater than,
 * less than, or equal to a second randomly generated value.
 */
import java.util.Random;

import static net.mindview.util.Print.*;

public class IfElseRandom {
    public static void main(String[] args) {
        Random rnd = new Random();
        int randomValue = rnd.nextInt(20);
        int secondRandomValue = rnd.nextInt(20);
        int count = 1;
        String result = null;
        do {
            if (randomValue > secondRandomValue)
                result = " is greater than ";
            else if (randomValue < secondRandomValue)
                result = " is less than ";
            else
                result = " is equals to ";

            print(count + ": " + randomValue + result + secondRandomValue);

            if (count != 1)
                randomValue = rnd.nextInt(20);
            else
                randomValue = secondRandomValue;
        } while(count++ < 25);
    }
}

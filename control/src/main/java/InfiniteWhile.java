/**
 * Exercise 3: (1) Modify Exercise 2 so that your code is surrounded
 * by an “infinite” while loop. It will then run until you interrupt
 * it from the keyboard (typically by pressing Control-C).
 */

import java.util.Random;

import static net.mindview.util.Print.*;

public class InfiniteWhile {
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

            if (count++ != 1)
                randomValue = rnd.nextInt(20);
            else
                randomValue = secondRandomValue;
        } while(true);
    }
}

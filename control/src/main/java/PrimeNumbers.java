/**
 * Exercise 4: (3) Write a program that uses two nested for loops
 * and the modulus operator (%) to detect and print prime numbers
 * (integral numbers that are not evenly divisible by any other numbers
 * except for themselves and 1).
 */
import static net.mindview.util.Print.*;

public class PrimeNumbers {
    public static void main(String[] args) {
        print(2);
        for (int prime = 3; prime < 1000; prime += 2) {
            boolean isPrime = true;
            for (int divider = 2; divider < prime / 2; divider++ ) {
                if (prime % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                print(prime);
        }
    }
}

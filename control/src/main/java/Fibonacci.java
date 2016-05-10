/**
 * Exercise 9: (4) A _Fibonacci_ sequence is the sequence of numbers
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on, where each number (from
 * the third on) is the sum of the previous two. Create a method that
 * takes an integer as an argument and displays that many Fibonacci numbers
 * starting from the beginning, e.g., If you run java Fibonacci 5
 * (where Fibonacci is the name of the class) the output will be: 1, 1, 2, 3, 5.
 */
public class Fibonacci {
    private static void printFibonacci(int end) {
        int first = 1;
        int second = 1;
        do {
            System.out.print(first);
            second = first + second;
            first = second - first;
            if (first <= end) System.out.print(", ");
        } while (first <= end);
    }

    public static void main(String[] args) {
        printFibonacci(Integer.parseInt(args[0]));
    }
}

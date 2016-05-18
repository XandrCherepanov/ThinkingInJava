/**
 * Exercise 21: (1) Create an enum of the least-valuable six types
 * of paper currency. Loop through the values() and print each value
 * and its ordinal().
 */
public enum Currency {
    DOLLAR, EURO, SUM, TENGE, ROUBLE, YUAN;

    public static void main(String[] args) {
        for (Currency currency : Currency.values()) {
            System.out.println(currency + ", ordinal " + currency.ordinal());
        }
    }
}

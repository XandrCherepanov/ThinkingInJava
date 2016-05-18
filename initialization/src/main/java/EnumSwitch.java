/**
 * Exercise 22: (2) Write a switch statement for the enum in
 * the previous example. For each case, output a description of that
 * particular currency.
 */
import java.util.Random;

public class EnumSwitch {
    public static void main(String[] args) {
        Random rnd = new Random();
        Currency currency = Currency.values()[rnd.nextInt(6)];
        switch (currency) {
            case DOLLAR:
                System.out.println("American Dollar");
                break;
            case EURO:
                System.out.println("Europian Currency");
                break;
            case ROUBLE:
                System.out.println("Russian Currency");
                break;
            case SUM:
                System.out.println("Uzbekistan Currency");
                break;
            case TENGE:
                System.out.println("Kazakhstan Currency");
                break;
            case YUAN:
                System.out.println("Chinese Currency");
                break;
        }
    }
}

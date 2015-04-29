/**
 * Exercise 9: (2) Write a program that demonstrates
 * that autoboxing works for all the primitive types and their wrappers.
 */
public class Autoboxing {
    public static void main(String[] args) {
        Boolean boolWrapper = true;
        boolean boolPrimitive = boolWrapper;
        System.out.println("boolPrimitive (" + boolPrimitive +
                ") = boolWrapper (" + boolWrapper + ")");

        Character charWrapper = 'a';
        char charPrimitive = charWrapper;
        System.out.println("charPrimitive (" + charPrimitive +
                ") = charWrapper (" + charWrapper + ")");

        Byte byteWrapper = 100;
        byte bytePrimitive = byteWrapper;
        System.out.println("bytePrimitive (" + bytePrimitive +
                ") = byteWrapper (" + byteWrapper + ")");

        Short shortWrapper = 1000;
        short shortPrimitive = shortWrapper;
        System.out.println("shortPrimitive (" + shortPrimitive +
                ") = shortWrapper (" + shortWrapper + ")");

        Integer intWrapper = 42;
        int intPrimitive = intWrapper;
        System.out.println("intPrimitive (" + intPrimitive +
                ") = intWrapper (" + intWrapper + ")");

        Long longWrapper = 42L;
        long longPrimitive = longWrapper;
        System.out.println("longPrimitive (" + longPrimitive +
                ") = longWrapper (" + longWrapper + ")");

        Float floatWrapper = 3.14f;
        float floatPrimitive = floatWrapper;
        System.out.println("floatPrimitive (" + floatPrimitive +
                ") = floatWrapper (" + floatWrapper + ")");

        Double doubleWrapper = 2.72;
        double doublePrimitive = doubleWrapper;
        System.out.println("doublePrimitive (" + doublePrimitive +
                ") = doubleWrapper (" + doubleWrapper + ")");
    }
}

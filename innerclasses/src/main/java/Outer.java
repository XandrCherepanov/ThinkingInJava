/**
 * Exercise 1: (1) Write a class named Outer that contains an inner class named Inner.
 * Add a method to Outer that returns an object of type Inner.
 * In main( ), create and initialize a reference to an Inner.
 */

public class Outer {
   class Inner {
      public void func() {
         System.out.println("Inner.func() called");
      }
   }

   public Inner inner() {
      return new Inner();
   }

   public static void main(String[] args) {
      Outer outer = new Outer();
      Outer.Inner inner = outer.inner();
      inner.func();
   }
}

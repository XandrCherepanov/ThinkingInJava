/**
 * Exercise 6: (3) Following Exercise 5, create a new Dog reference
 * and assign it to spot’s object. Test for comparison
 * using == and equals( ) for all references.
 */

import static net.mindview.util.Print.*;

public class DogsComparison {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "spot";
        dog1.says = "Ruff!";

        Dog dog2 = new Dog();
        dog2.name = "scruffy";
        dog2.says = "Wurf!";

        Dog dog3 = dog1;
        print("dog1's name is " + dog1.name);
        print("dog1 says " + dog1.says);
        print();
        print("dog2's name is " + dog2.name);
        print("dog2 says " + dog2.says);
        print();
        print("dog3's name is " + dog3.name);
        print("dog3 says " + dog3.says);
        print();

        if (dog1 == dog2) {
            print("dog1 == dog2");
        }
        if (dog2 == dog3) {
            print("dog2 == dog3");
        }
        if (dog1 == dog3) {
            print("dog1 == dog3");
        }

        if (dog1.equals(dog2)) {
            print("dog1.equals(dog2)");
        }
        if (dog2.equals(dog3)) {
            print("dog2.equals(dog3)");
        }
        if (dog1.equals(dog3)) {
            print("dog1.equals(dog3)");
        }

    }
}

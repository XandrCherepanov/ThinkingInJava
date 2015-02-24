/**
 * Exercise 5: (2) Create a class called Dog containing
 * two Strings: name and says. In main( ), create two dog objects
 * with names “spot” (who says, “Ruff!”) and “scruffy”
 * (who says, “Wurf!”). Then display their names and what they say.
 */

import static net.mindview.util.Print.*;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "spot";
        dog1.says = "Ruff!";

        Dog dog2 = new Dog();
        dog2.name = "scruffy";
        dog2.says = "Wurf!";

        print("dog1's name is " + dog1.name);
        print("dog1 says " + dog1.says);
        print();
        print("dog2's name is " + dog2.name);
        print("dog2 says " + dog2.says);
    }
}

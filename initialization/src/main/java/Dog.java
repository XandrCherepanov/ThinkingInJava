/**
 * Exercise 5: (2) Create a class called Dog with an overloaded
 * bark() method. This method should be overloaded based on various
 * primitive data types, and print different types of barking, howling, etc.,
 * depending on which overloaded version is called. Write a main()
 * that calls all the different versions.
 */
public class Dog {
    public void bark(char value) {
        System.out.println("Wow!");
    }

    public void bark(int value) {
        System.out.println("Howww!");
    }

    public void bark(float value) {
        System.out.println("Gav!");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark('c');
        dog.bark(5);
        dog.bark(5.3f);
    }
}

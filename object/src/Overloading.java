/*
 * Exercise 16: (1) In the Initialization & Cleanup chapter, locate the Overloading.java example
 * and add Javadoc documentation. Extract this comment documentation into an HTML file using Javadoc
 * and view it with your Web browser.
 */

// Demonstration of both constructor
// and ordinary method overloading.

import static net.mindview.util.Print.*;

/**
 * Represents the tree object
 */
class Tree {
    /**
     * Height of the tree
     */
    int height;

    /**
     * Default constructor without parameters
     */
    Tree() {
        print("Planting a seedling");
        height = 0;
    }

    /**
     * Constructor with parameter
     *
     * @param initialHeight starting height of the tree
     */
    Tree(int initialHeight) {
        height = initialHeight;
        print("Creating new Tree that is " +
                height + " feet tall");
    }

    /**
     * Prints information about the tree
     */
    void info() {
        print("Tree is " + height + " feet tall");
    }

    /**
     * Overloaded method for printing info
     *
     * @param s string param
     * @see Tree#info
     */
    void info(String s) {
        print(s + ": Tree is " + height + " feet tall");
    }
}

/**
 * Class to show overloading
 */
public class Overloading {
    /**
     * Main entry point in program
     *
     * @param args array of command-line params
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        // Overloaded constructor:
        new Tree();
    }
}
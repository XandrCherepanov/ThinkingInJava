/**
 * Exercise 8: (4) Following the form of the example Lunch.java,
 * create a class called ConnectionManager that manages a fixed array
 * of Connection objects. The client programmer must not be able to
 * explicitly create Connection objects, but can only get them via a
 * static method in ConnectionManager. When the ConnectionManager
 * runs out of objects, it returns a null reference.
 * Test the classes in main().
 */
package access;

public class ConnectionManager {

    private static Connection[] connections = null;
    private static final int LIMIT = 3;
    private static int current = 0;

    static {
        connections = new Connection[LIMIT];
        for (int i = 0; i < connections.length; i++)
            connections[i] = Connection.createConnection();
    }

    public static Connection getConnection() {
        if (current >= LIMIT)
            return null;
        return connections[current++];
    }
}

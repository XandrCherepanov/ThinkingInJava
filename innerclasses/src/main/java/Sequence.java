/**
 * Exercise 2: (1) Create a class that holds a String, and has a toString( ) method
 * that displays this String. Add several instances of your new class
 * to a Sequence object, then display them.
 */

// Holds a sequence of Objects.
interface Selector {
    boolean end();

    Object current();

    void next();
}

class SequenceObject {
    private String value;

    public SequenceObject(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) i++;
        }
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 8; i++)
            sequence.add(Integer.toString(i));
        sequence.add(new SequenceObject("Eight"));
        sequence.add(new SequenceObject("Nine"));

        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
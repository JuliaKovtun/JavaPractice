package task_2;

import java.util.Iterator;

public class Stack <T> implements Iterable<T> {
    private Node<T> top;

    public Stack(final Node<T> top) { this.top = top; }
    public Stack() {}
    public Stack(final Stack<T> stack) { this.top = stack.top; }

    public boolean isEmpty() { return top == null; }
    public T getTopValue() { return (T) top.getValue(); }

    public T push(final T value) {
        final Node node = new Node(value);
        node.setNext(top);
        top = node;

        return value;
    }

    public T pop() {
        final T value = (T) top.getValue();
        top = top.getNext();
        return value;
    }

    public Iterator<T> iterator() { return new StackIterator(this); }

    class StackIterator<T> implements Iterator<T> {
        Node<T> current;

        public StackIterator(Stack<T> stack){ this.current = stack.top; }

        public boolean hasNext() {
            return this.current != null;
        }

        public T next() {
            final T value = current.getValue();
            current = current.getNext();
            return value;
        }
    }

}

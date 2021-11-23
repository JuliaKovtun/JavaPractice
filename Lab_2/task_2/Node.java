package task_2;

public class Node<T> {
    private T value;
    private Node next = null;

    public T getValue() {
        return value;
    }
    public void setValue(final T data) { this.value = data; }

    public Node getNext() {
        return next;
    }
    public void setNext(final Node next) {
        this.next = next;
    }

    public Node(final T value) {
        this.value = value;
    }
    public Node() {}
}

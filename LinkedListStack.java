package stack;

import java.util.LinkedList;

public class LinkedListStack<T> extends AbstractStack<T> {
    private LinkedList<T> stack;

    public LinkedListStack() {
        this.stack = new LinkedList<>();
    }

    @Override
    public void push(T element) {
        stack.addLast(element);
    }

    @Override
    public T pop() {
        return stack.removeLast();
    }

    @Override
    public T peek() {
        return stack.getLast();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int size() {
        return stack.size();
    }
}


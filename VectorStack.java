package stack;

import java.util.Stack;

public class VectorStack<T> extends AbstractStack<T> {
    private Stack<T> stack;

    public VectorStack() {
        this.stack = new Stack<>();
    }

    @Override
    public void push(T element) {
        stack.push(element);
    }

    @Override
    public T pop() {
        return stack.pop();
    }

    @Override
    public T peek() {
        return stack.peek();
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


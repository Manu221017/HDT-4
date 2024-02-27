package factory;

import stack.LinkedListStack;
import stack.Stack;
import list.List;

import java.util.Queue;

public class DataStructureFactory {
    public static <T> Stack<T> createStack(String stackType) {
        if ("LinkedList".equalsIgnoreCase(stackType)) {
            return new LinkedListStack<>();
        } else {
            throw new IllegalArgumentException("Invalid implementation: " + stackType + ".\nAvailable implementations: LinkedList");
        }
    }

    @SuppressWarnings("unchecked")
    public static <T, V extends List<T>> Queue<T> createQueue(V queueImplementation, String queueType) {
        if ("Array".equalsIgnoreCase(queueType) || "Circular".equalsIgnoreCase(queueType)) {
            return (Queue<T>) queueImplementation;
        } else {
            throw new IllegalArgumentException("Invalid queue type: " + queueType);
        }
    }
}


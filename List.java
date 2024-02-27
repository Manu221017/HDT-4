package list;

import java.util.ArrayList;

public interface List<T> {

    int ArrayList = 0;

    static <T> List<T> createList(String listType) {
        if ("LinkedList".equalsIgnoreCase(listType)) {
            return new SinglyLinkedList<>();
        } else if ("Array".equalsIgnoreCase(listType)) {
            return  ArrayList<>();
        } else {
            throw new IllegalArgumentException("No se reconoce el tipo de lista: " + listType);
        }
    }

}

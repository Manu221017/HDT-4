import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario la implementación deseada para el stack
            System.out.println("Seleccione la implementación deseada para el stack:");
            System.out.println("1. ArrayList");
            System.out.println("2. Vector");
            System.out.println("3. LinkedList");
            int stackChoice = scanner.nextInt();

            if (stackChoice == 3) {
                System.out.println("Seleccione la implementación deseada para la lista:");
                System.out.println("1. SinglyLinkedList");
                System.out.println("2. DoublyLinkedList");
            }
        }

        // Leer la expresión infix del archivo datos.txt
        String infixExpression = ""; // Leer la expresión infix del archivo datos.txt

        // Convertir la expresión infix a postfix
        String postfixExpression = InfixToPostfixConverter.convertToPostfix(infixExpression);

        // Mostrar la expresión postfix
        System.out.println("Expresión infix: " + infixExpression);
        System.out.println("Expresión postfix: " + postfixExpression);

        // Evaluar la expresión postfix y mostrar el resultado
        // Implementar esta parte
    }
}


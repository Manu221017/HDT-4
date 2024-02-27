package singleton;

public class Calculator {
    private static Calculator instance;

    private Calculator() {
        // Constructor privado para evitar la creación de instancias directas
    }

    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }

    // Métodos para la evaluación de expresiones infix y postfix
}

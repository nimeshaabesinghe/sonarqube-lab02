package main.java.com.example;

public class Calculator {

    public int calculate(int a, int b, Operation op) {

        switch (op) {
            case ADD:
                return a + b;

            case SUB:
                return a - b;

            case MUL:
                return a * b;

            case DIV:
                if (b == 0) {
                    throw new IllegalArgumentException("Division by zero");
                }
                return a / b;

            case MOD:
                return a % b;

            case POW:
                return power(a, b);

            default:
                throw new UnsupportedOperationException("Invalid operation");
        }
    }

    private int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}

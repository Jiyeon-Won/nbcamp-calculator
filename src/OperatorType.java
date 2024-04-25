public enum OperatorType {
    ADD('+'), SUBTRACT('-'), MULTIPLY('*'), DIVIDE('/'), MOD('%');

    private final char operation;

    OperatorType(char operation) {
        this.operation = operation;
    }

    public static OperatorType setOperation(char operation) {
        OperatorType type = null;
        switch (operation) {
            case '+' -> type = ADD;
            case '-' -> type = SUBTRACT;
            case '*' -> type = MULTIPLY;
            case '/' -> type = DIVIDE;
            case '%' -> type = MOD;
        }
        return type;
    }

    public char getOperation() {
        return operation;
    }
}
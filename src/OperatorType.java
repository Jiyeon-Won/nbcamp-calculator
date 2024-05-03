import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum OperatorType {
    ADD('+'), SUBTRACT('-'), MULTIPLY('*'), DIVIDE('/'), MOD('%');

    private final char operation;

    final static Map<Character, OperatorType> mapType = Arrays.stream(OperatorType.values()).collect(Collectors.toMap(OperatorType::getOperation, type -> type));


    OperatorType(char operation) {
        this.operation = operation;
    }

    public static OperatorType setOperation(char operation) {
        if (mapType.get(operation) != null) {
            return mapType.get(operation);
        }
        throw new IllegalArgumentException("잘못된 연산자 입력 : " + operation + " (+, -, *, /, % 중 입력하세요)");
    }

    public char getOperation() {
        return operation;
    }
}
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum OperatorType {
    //    ADD('+'/*, new AddOperator<>()*/), SUBTRACT('-'), MULTIPLY('*'), DIVIDE('/'), MOD('%');
    ADD('+'), SUBTRACT('-'), MULTIPLY('*'), DIVIDE('/'), MOD('%');

    private final char operation;

    final static Map<Character, OperatorType> mapType = Arrays.stream(OperatorType.values()).collect(Collectors.toMap(OperatorType::getOperation, type -> type));

    OperatorType(char operation) {
        this.operation = operation;
    }

    public static OperatorType setOperation(char operation) {
//        OperatorType type = ;
//        for (OperatorType ot : OperatorType.values()) {
//            return ot;
//        }
        return mapType.get(operation);
    }

    public char getOperation() {
        return operation;
    }
}
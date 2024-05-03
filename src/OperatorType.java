import java.util.Arrays;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public enum OperatorType {

    //    ADD('+', (num1, num2) -> num1.doubleValue() + num2.doubleValue()),
//    SUBTRACT('-', (num1, num2) -> num1.doubleValue() - num2.doubleValue()),
//    MULTIPLY('*', (num1, num2) -> num1.doubleValue() * num2.doubleValue()),
//    DIVIDE('/', (num1, num2) -> num1.doubleValue() / num1.doubleValue()),
//    MOD('%', (num1, num2) -> num1.doubleValue() % num1.doubleValue());
    ADD('+'), SUBTRACT('-'), MULTIPLY('*'), DIVIDE('/'), MOD('%');

    private final char operation;
//    private final BiFunction<Number, Number, Double> biFunction;

    final static Map<Character, OperatorType> mapType = Arrays.stream(OperatorType.values()).collect(Collectors.toMap(OperatorType::getOperation, type -> type));

//    OperatorType(char operation, BiFunction<Number, Number, Double> biFunction) {
//        this.operation = operation;
//        this.biFunction = biFunction;
//    }


    OperatorType(char operation) {
        this.operation = operation;
    }

    public static OperatorType setOperation(char operation) {
//        return Arrays.stream(values())
//                .filter(v -> v.operation == operation)
//                .findAny()
//                .orElse(null);
//        OperatorType type = ;
//        for (OperatorType ot : OperatorType.values()) {
//            return ot;
//        }
        return mapType.get(operation);
    }

//    public Double biFuncCalc(Number num1, Number num2) {
//        return biFunction.apply(num1, num2);
//    }


    public char getOperation() {
        return operation;
    }
}
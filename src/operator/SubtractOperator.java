package operator;

public class SubtractOperator<T extends Number> implements Operator<T> {
    public T operate(T num1, T num2) {
        double result = num1.doubleValue() - num2.doubleValue();
        return NumberConversionUtils.convertNumberToType(result);
    }
}
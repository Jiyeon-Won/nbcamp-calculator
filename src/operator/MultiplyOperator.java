package operator;

public class MultiplyOperator<T extends Number> implements Operator<T> {
    @Override
    public T operate(T num1, T num2) {
        double result = num1.doubleValue() * num2.doubleValue();
        return NumberConversionUtils.convertNumberToType(result);
    }
}
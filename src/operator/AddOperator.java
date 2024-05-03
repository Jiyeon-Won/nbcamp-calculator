package operator;

public class AddOperator<T extends Number> implements Operator<T> {

    public T operate(T num1, T num2) {
        double result = num1.doubleValue() + num1.doubleValue();
        return NumberConversionUtils.convertNumberToType(result);
    }
}
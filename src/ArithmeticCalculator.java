import operator.*;

import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number> extends Calculator {

    public ArithmeticCalculator(ArrayList<Double> list) {
        super(list);
    }

    public T calculate(T num1, T num2, OperatorType type) throws  ArithmeticException {
        Operator<T> operator = null;

        switch (type) {
            case ADD -> operator = new AddOperator<>();
            case SUBTRACT -> operator = new SubtractOperator<>();
            case MULTIPLY -> operator = new MultiplyOperator<>();
            case DIVIDE -> operator = new DivideOperator<>();
            case MOD -> operator = new ModOperator<>();
        }

        T result = operator.operate(num1, num2);
        return result;
    }

    public void printValuesBiggerInput(double input) {
        System.out.println(input + "보다 큰 값");
        getList().stream()
                .filter(value -> value > input)
                .forEach(System.out::println);
    }
}
import operator.*;

import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number> extends Calculator {

    public ArithmeticCalculator(ArrayList<Double> list) {
        super(list);
    }

    public double calculate(T num1, T num2, OperatorType type) throws Exception {
        Operator<T> operator;

        switch (type) {
            case ADD -> operator = new AddOperator<>();
            case SUBTRACT -> operator = new SubtractOperator<>();
            case MULTIPLY -> operator = new MultiplyOperator<>();
            case DIVIDE -> operator = new DivideOperator<>();
            case MOD -> operator = new ModOperator<>();
            default -> throw new Exception("잘못된 기호");
        }

        double result = operator.operate(num1, num2);
        addList(result);
        return result;
    }
}
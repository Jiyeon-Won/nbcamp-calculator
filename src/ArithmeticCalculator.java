import operator.Operator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator(ArrayList<Double> list) {
        super(list);
    }

    public double calculate(int num1, int num2, Operator operator) throws Exception {
        double result = operator.operate(num1, num2);
        addList(result);
        return result;
    }
}
import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {
    private AddOperator addOperator;
    private SubtractOperator subtractOperator;
    private MultiplyOperator multiplyOperator;
    private DivideOperator divideOperator;

    public ArithmeticCalculator(ArrayList<Double> list) {
        super(list);
        this.addOperator = new AddOperator();
        this.subtractOperator = new SubtractOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.divideOperator = new DivideOperator();
    }

    public double add(int num1, int num2) {
        double result = addOperator.operate(num1, num2);
        addList(result);
        return result;
    }

    public double subtract(int num1, int num2) {
        double result = subtractOperator.operate(num1, num2);
        addList(result);
        return result;
    }

    public double multiply(int num1, int num2) {
        double result = multiplyOperator.operate(num1, num2);
        addList(result);
        return result;
    }

    public double divide(int num1, int num2) throws Exception {
        double result = divideOperator.operate(num1, num2);
        addList(result);
        return result;
    }

    public double calculate(int num1, int num2, char operation) throws Exception {
        double result = 0;
        switch (operation) {
            case '+':
                add(num1, num2);
                break;
            case '-':
                subtract(num1, num2);
                break;
            case '*':
                multiply(num1, num2);
                break;
            case '/':
                divide(num1, num2);
                break;
        }
        return result;
    }
}
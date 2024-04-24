import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator(ArrayList<Double> list) {
        super(list);
    }

    public double calculate(int num1, int num2, char operation) throws Exception {
        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new Exception("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = (double) num1 / num2;
                break;
        }
        addList(result);
        return result;
    }
}
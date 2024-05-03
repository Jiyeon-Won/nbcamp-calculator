package operator;

public class DivideOperator<T extends Number> implements Operator<T> {
    public T operate(T num1, T num2) throws Exception {
        if (num2.doubleValue() == 0) {
            throw new Exception("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }
        double result = num1.doubleValue() / num2.doubleValue();
        return NumberConversionUtils.convertNumberToType(result);
    }
}
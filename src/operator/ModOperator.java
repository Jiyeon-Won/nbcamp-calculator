package operator;

public class ModOperator<T extends Number> implements Operator<T> {
    @Override
    public double operate(T num1, T num2) throws Exception {
        if (num2.doubleValue() == 0) {
            throw new Exception("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }
        return num1.doubleValue() % num2.doubleValue();
    }
}
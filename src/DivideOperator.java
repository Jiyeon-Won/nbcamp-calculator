public class DivideOperator {
    public double operate(int num1, int num2) throws Exception {
        if (num2 == 0) {
            throw new Exception("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }
        return (double) num1 / num2;
    }
}
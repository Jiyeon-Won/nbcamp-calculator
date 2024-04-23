import java.util.*;

public class Calculator {

    private List<Integer> list = new ArrayList<>();

    public int calculate(int num1, int num2, char operation) throws Exception {
        int result = 0;
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
                result = num1 / num2;
                break;
        }
        return result;
    }

    public void removeResult() {
        list.remove(0);
    }

    public void inquiryResults() {
        for (int data : getList()) {
            System.out.println("컬렉션에 저장된 값: " + data);
        }
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }
}
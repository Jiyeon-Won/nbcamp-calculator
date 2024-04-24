import java.util.*;

public class Calculator {

    static final double PI = 3.14;

    private ArrayList<Double> calList;
    private ArrayList<Double> circleAreas;

    public Calculator(ArrayList<Double> circleAreas, ArrayList<Double> calList) {
        this.circleAreas = circleAreas;
        this.calList = calList;
    }

    public double calculateCircleArea(int radius) {
        return radius * radius * PI;
    }

    public void saveCircle(double circleArea) {
        circleAreas.add(circleArea);
    }

    public void inquiryCircles() {
        int index = 1;
        for (double data : getCircleAreas()) {
            System.out.println("저장된 원의 넓이 " + (index++) + "번째: " + data);
        }
    }

    public ArrayList<Double> getCircleAreas() {
        return circleAreas;
    }

    public void setCircleAreas(ArrayList<Double> circleAreas) {
        this.circleAreas = circleAreas;
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
                result = num1 / num2;
                break;
        }
        calList.add(result);
        return result;
    }

    public void removeResult() {
        calList.remove(0);
    }

    public void inquiryResults() {
        for (double data : getCalList()) {
            System.out.println("컬렉션에 저장된 값: " + data);
        }
    }

    public List<Double> getCalList() {
        return calList;
    }

    public void setCalList(ArrayList<Double> calList) {
        this.calList = calList;
    }
}
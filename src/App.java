import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Calculator calculator;

        do {
            System.out.println("1번 원의 넓이, 2번 사칙연산");
            char select = sc.next().charAt(0);
            if (select == '1') {
                calculator = CircleCalculator.getInstance();
                System.out.print("원의 반지름 입력: ");
                int radius = sc.nextInt();
                double circleArea = calculator.calculateCircleArea(radius);
                calculator.saveCircle(circleArea);
                calculator.inquiryCircles();
            }
            if (select == '2') {
                calculator = ArithmeticCalculator.getInstance();
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();
                System.out.print("사칙연산 기호를 입력하세요: ");
                char operation = sc.next().charAt(0);

                calculator.calculate(num1, num2, operation);

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                if ("remove".equals(sc.next())) {
                    calculator.removeResult();
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                if ("inquiry".equals(sc.next())) {
                    calculator.inquiryResults();
                }
            }

            System.out.println("더 계산하시려면 아무거나 입력하세요 (exit 입력 시 종료)");
        } while (!sc.next().equals("exit"));
    }
}
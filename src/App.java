import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        CircleCalculator cal1 = new CircleCalculator(new ArrayList<>());
        ArithmeticCalculator<Double> cal2 = new ArithmeticCalculator<>(new ArrayList<>());

        do {
            System.out.println("1번 원의 넓이, 2번 사칙연산");
            char select = sc.next().charAt(0);
            if ('1' == select) {
                calculateCircleArea(sc, cal1);
            }
            if ('2' == select) {
                calculateArithmetic(sc, cal2);
            }

            System.out.println("더 계산하시려면 아무거나 입력하세요 (exit 입력 시 종료)");
        } while (!"exit".equals(sc.next()));
    }

    private static void calculateArithmetic(Scanner sc, ArithmeticCalculator<Double> cal2) throws Exception {
        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = sc.nextDouble();
        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = sc.nextDouble();
        System.out.print("사칙연산 기호를 입력하세요: ");
        char operation = sc.next().charAt(0);

        cal2.calculate(num1, num2, OperatorType.setOperation(operation));

        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        if ("remove".equals(sc.next())) {
            cal2.removeFirstData();
        }

        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        if ("inquiry".equals(sc.next())) {
            cal2.inquiryList();
        }

        System.out.println("입력한 값 보다 큰 값들 출력 (x 입력 시 조회안함)");
        String input = sc.next();
        if (!"x".equals(input)){
            cal2.printValuesBiggerInput(Double.parseDouble(input));
        }
    }

    private static void calculateCircleArea(Scanner sc, CircleCalculator cal1) {
        System.out.print("원의 반지름 입력: ");
        int radius = sc.nextInt();
        double circleArea = cal1.calculateCircleArea(radius);
        cal1.addList(circleArea);
        cal1.inquiryList();
    }
}
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();

        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operation = sc.next().charAt(0);

            int result = calculator.calculate(num1, num2, operation);
            list.add(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if ("remove".equals(sc.next())) {
                calculator.removeResult();
            }
            calculator.setList(list);

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if ("inquiry".equals(sc.next())) {
                for (int data : calculator.getList()) {
                    System.out.println("컬렉션에 저장된 값: " + data);
                }
            }

            System.out.println("더 계산하시려면 아무거나 입력하세요 (exit 입력 시 종료)");
        } while (!sc.next().equals("exit"));
    }
}
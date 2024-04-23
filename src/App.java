import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operation = sc.next().charAt(0);

            int calculatedNumber = calculator.calculate(num1, num2, operation);
            System.out.println("결과: " + calculatedNumber);

            System.out.println("더 계산하시려면 아무거나 입력하세요 (exit 입력 시 종료)");
        } while (!sc.next().equals("exit"));
    }
}
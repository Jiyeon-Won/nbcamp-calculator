import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrNum = new int[10];
        int index = 0;
        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char ch = sc.next().charAt(0);
            int result = 0;
            switch (ch) {
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
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }
                    result = num1 / num2;
                    break;
                case '%':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }
                    result = num1 % num2;
                    break;
            }
            System.out.println("결과: " + result);
            arrNum[index++] = result;

            System.out.println("더 계산하시려면 아무거나 입력하세요 (exit 입력 시 종료)");
        } while (!sc.next().equals("exit"));
        for (int num : arrNum) {
            System.out.println("배열에 저장된 값: " + num);
        }
    }
}
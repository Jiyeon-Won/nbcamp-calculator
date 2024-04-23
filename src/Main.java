import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char ch = sc.next().charAt(0);
            int result = 0;
//            switch (ch) {
//                case '+':
//                    result = num1 + num2;
//                    break;
//                case '-':
//                    result = num1 - num2;
//                    break;
//                case '*':
//                    result = num1 * num2;
//                    break;
//                case '/':
//                    if (num2 == 0) {
//                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
//                        break;
//                    }
//                    result = num1 / num2;
//                    break;
//                case '%':
//                    if (num2 == 0) {
//                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
//                        break;
//                    }
//                    result = num1 % num2;
//                    break;
//            }
            list.add(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if ("remove".equals(sc.next())) {
                list.remove(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if ("inquiry".equals(sc.next())) {
                for (int num : list) {
                    System.out.println("배열에 저장된 값: " + num);
                }
            }

            System.out.println("더 계산하시려면 아무거나 입력하세요 (exit 입력 시 종료)");
        } while (!sc.next().equals("exit"));
    }
}
package scanner.ex;
/* 상품 가격 계산
*
* 사용자로부터 상품의 가격(price)과 수량(quantity)을 입력받고, 총 비용을 출력하는 프로그램을 작성하세요.*
* 가격과 수량을 입력 받은 후에는 이들의 곱을 출력하세요.
* 출력 형태는 "총 비용: [곱합 결과]" 이어야 합니다.
* -1을 입력하여 가격 입력을 종료합니다.
*  */
import java.util.Scanner;

public class ScannerWhileEx2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt();

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}

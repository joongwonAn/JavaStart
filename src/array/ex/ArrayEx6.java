package array.ex;
/* 가장 작은 수, 큰 수 찾기
* 사용자로부터 n개의 정수를 입력받아 배열에 저장한 후,
* 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로그램을 작성하자.
*  */

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int maxNumber, minNumber;

        System.out.println(count + "개의 정수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
//        maxNumber = numbers[0];
//        minNumber = numbers[0];
        // 아래와 같이 줄일 수 있다.
        maxNumber = minNumber = numbers[0];
        for (int number : numbers) {
            if (maxNumber < number) {
                maxNumber = number;
            }
            if (minNumber > number) {
                minNumber = number;
            }
        }

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);
    }
}

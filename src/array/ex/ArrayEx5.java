package array.ex;
/* 합계와 평균2
* 이전 문제에서 입력받을 숫자의 개수를 입력받도록 개선하자
* */

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();

        System.out.println(count + "개의 정수를 입력하세요: ");
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        double average = (double) total / numbers.length;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);
    }
}

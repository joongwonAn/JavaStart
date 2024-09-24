package scanner.ex;
/*
*
* 사용자 입력을 받아 그 합계를 계산하는 프로그램을 작성해야 한다.
* 사용자는 한 번에 한 개의 정수를 입력할 수 있으며, 사용자가 0을 입력하면 프로그램은 종료된다.
* 이 때, 프로그램이 종료될 때까지 사용자가 입력한 모든 정수의 합을 출력해야 한다.
*  */
import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        int count = 0;

        /*while (true) {

            System.out.print("정수를 입력하세요. (-1을 입력하면 종료): ");
            int num = input.nextInt();
            if (num == -1) {
                System.out.println("프로그램 종료");
                break;
            }

            sum += num;
            count++;
        }*/

        while ((num = input.nextInt()) != -1) {
            sum += num;
            count++;
        }
        double average = (double) sum / count;

        System.out.println("입력한 모든 정수의 합: " + sum);
        System.out.println("입력한 모든 정수의 평균: " + average);
    }
}

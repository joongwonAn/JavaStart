package loop.ex;
/*
반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해 보세요.
이때, num이라는 변수를 사용하여 수를 표현해야 합니다.
 */
public class WhileEx2 {

    public static void main(String[] args) {
        int num =1;
        int count = 0;

        while (count < 10) {
            if (num % 2 == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}

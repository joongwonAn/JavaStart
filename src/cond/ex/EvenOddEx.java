package cond.ex;
/*
정수 x가 주어지면 x가 짝수이면 "짝수"를, x가 홀수이면 "홀수"를 출력하는 프로그램을 작성하자.
삼항연산자를 사용해야 한다.
 */
public class EvenOddEx {

    public static void main(String[] args) {
        int x = 2;

        String result = (x % 2 == 0) ? "짝수" : "홀수";

        System.out.println("x = " + x + " , " + result);
    }
}

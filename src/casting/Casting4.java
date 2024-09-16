package casting;
/*
* 자바 계산
* 1) 같은 타입끼리의 계산은 같은 타입의 결과를 낸다.
* int + int는 int를, double+ double은 double의 결과가 나온다.
* 2) 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다.
* int + long은 long + long으로 자동 형변환이 일어난다.
* int + double은 double + double로 자동 형변환이 일어난다.
* */
public class Casting4 {

    public static void main(String[] args) {
        int div1 = 3 / 2; // int / int -> int
        System.out.println("div1 = " + div1); // 1

        double div2 = 3 / 2;
        /* 수행과정
        * double div2 = 3 / 2; // int / int
        * double div2 = 1; // int / int -> int
        * double div2 = (double) 1; // int -> double에 대입해야 함. 자동 형변환 발생
        * double div2 = 1.0; // 1(inr) -> 1.0(double)로 형변환 됨
        * */
        System.out.println("div2 = " + div2); // 1.0

        double div3 = 3.0 / 2;
        /* 수행과정
         * double div3 = 3.0 / 2; // double / int
         * double div3 = 3.0 / (double) 2; // double / double로 형변환 발생
         * double div3 = 3.0 / 2.0; // double / double -> double
         * double div3 = 1.5;
         * */
        System.out.println("div3 = " + div3); // 1.5

        double div4 = (double) 3 / 2;
        /* 수행과정
         * double div4 = (double) 3 / 2; // 명시적 형변환 사용. (double) int / int
         * double div4 = (double) 3 / (double) 2; // double / double
         * double div4 = 3.0 / 2.0; // double / double -> double
         * double div3 = 1.5;
         * */
        System.out.println("div4 = " + div4); // 1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        /* 수행과정
        * double result = (double) a / b; // (double) int / int
        * double result = (double) 3 / 2; // 변수 값 읽기
        * double result = (double) 3 / (double) 2;
        * double result = 3.0 / 2.0; // double / double -> double
        * double result = 1.5;
        * */
        System.out.println("result = " + result); // 1.5
    }

    /* 출력결과
    * div1 = 1
    * div2 = 1.0
    * div3 = 1.5
    * div4 = 1.5
    * result = 1.5
    * */
}

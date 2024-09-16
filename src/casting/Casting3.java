package casting;
/* 형변환과 오버플로우
보통 오버플로우가 발생하면마치 시계가 한바퀴 돈 것 처럼 다시 처음부터 시작한다.
참고로 -214748648 숫자는 int의 가장 작은 숫자이다.
*/
public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("maxIntValue casting = " + intValue);
        /* 수행과정
        * maxIntValue = 2147483647; // int 최고값
        * intValue = (int) maxIntValue; // 변수 값 읽기
        * intValue = (int) 2147483647; // 형변환
        * intValue = 2147483647;
        * */

        intValue = (int) maxIntOver; // 형변환
        System.out.println("maxIntOver casting = " + intValue); //  오버플로우 발생
        /* 수행과정
         * maxIntOver = 2147483648L; // int 최고값 + 1
         * intValue = (int) maxIntOver; // 변수 값 읽기
         * intValue = (int) 2147483648L; // 형변환 시도
         * intValue = -2147483648;
         * */

        /* 출력 결과
        * maxIntValue casting = 2147483647
        * maxIntOver casting = -2147483648
        * */
    }
}

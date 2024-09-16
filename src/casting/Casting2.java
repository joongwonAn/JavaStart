package casting;
/* 명시적 형변환
큰 범위에서 작은 범위는 다음과 같은 문제가 발생한다.
1) 소수점 버림 2) 오버플로우

따라서 명시적 형변환이 필요하다.

참고) 형변환을 한다고 해서 doubleValue 자체의 타입이 변경되거나 그 안에 있는 값이 변경되는 것은 아니다.
*/
public class Casting2 {

    public static void main(String[] args) {
       double doubleValue = 1.5;
       int intValue = 0;

       //intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int) doubleValue; // 형변환
        System.out.println(intValue); // 1 출력
    }
}

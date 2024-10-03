package method;

public class Method1Ref {

    public static void main(String[] args) {
        // 계산 1
        // 메소드 이름 선택 후, ctrl+b 누르면 해당 메서드로 이동
        int sum1 = add(5, 10);
        System.out.println("결과1 출력: " + sum1);

        System.out.println("=====================");
        // 계산 2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력: " + sum2);

    }

    // * 메서드 선언 (Method Declaration)
    // 메서드 이름, 반환타입, 매개변수(파라미터) 목록을 포함한다.
    // 제어자 반환타입 메서드이름(매개변수 목록) {
    //     메서드 본문
    // }
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }

    // * 메서드 호출 용어정리
    // 메서드를 호출할 떄는 메서드에 넘기는 값과 매개변수(파라미터)의 타입, 순서, 갯수가 맞아야한다.
    //
    // 인수 (Argument) = 인자 = 아규먼트
    // 넘기는 값
    //
    // 매개변수 (parameter)
    // 메서드를 정의할 때 선언한 변수
    // 메서드를 호출할 때 인수를 넘기면, 그 인수가 매개변수에 대입된다.
}

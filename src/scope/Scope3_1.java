package scope;
/*
스코프 존재 이유
아래는 좋은 코드라 보기 어렵다.
temp는 if문 안에서만 사용하는 변수인데 main에 선언해버리면
1) 비효율적인 메모리 사용
2) 코드 복잡성 증가 : temp 변수를 생각해야하는 범위가 늘어남
라는 문제가 발생한다.

위 코드를 수정한 것은 Scope3_2에서 확인 가능
*/
public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}

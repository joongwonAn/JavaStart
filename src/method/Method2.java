package method;

public class Method2 {

    public static void main(String[] args) {
        printHeader();
        printFooter();
    }

    // 모든 메서드는 항상 return을 호출해야 한다.
    // 그런데 반환 타입 void의 경우에는 예외로 생락 가능하다.
    // 자바 컴파일러가 알아서 return을 마지막줄에 넣어줘서 메소드가 종료된다.
    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다. =");
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다. = ");
    }
}

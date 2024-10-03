package method;

public class MethodCasting2 {
    // double형 파마리터에 int형 인수를 전달하는데 문제없이 잘 동작한다.
    public static void main(String[] args) {
        int number = 100;
    }

    public static void printNumber(double n) {
        System.out.println("숫자: "+ n);
    }
}

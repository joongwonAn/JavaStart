package method.ex;

public class MethodEx1Ref {

    public static void main(String[] args) {
        System.out.println("평균값: " +  averageMethod(1, 2, 3));
        System.out.println("평균값: " + averageMethod(15, 25, 35));
    }

    public static double averageMethod(int a, int b, int c) {
        double average = (a + b + c) / 3.0;
        return average;
    }
}

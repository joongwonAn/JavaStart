package casting;
/* 자동형변환
작은 범위에서 큰 범위로는 당연히 값을 넣을 수 있다.

하지만 결국 대입하는 형(타입)을 맞추어야 하기 때문에 자바에서 자동 형변환을 실행한다.
*/
public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double
        /* 다음과 같은 자동형변환 과정을 거침
        * douleValue = intValue;
        * douleValue = (double) intValue;
        * douleValue = (double) 10;
        * douleValue = 10.0;
        * */
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);
    }
}

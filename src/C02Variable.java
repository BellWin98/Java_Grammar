import java.math.BigDecimal;
import java.util.Scanner;

public class C02Variable {
    public static void main(String[] args) {
        // byte로 썼을 때 -128 ~ 127까지 표현 가능, 범위 벗어나면 오버/언더플로우 발생
//        byte num1 = 127;
//        byte num2 = -128;
//        num1 += 1;
//        num2 -= 1;
//        System.out.println("num1 = " + num1 + " num2 = " + num2);

        // 실수: float, double (기본)
//        float f1 = 1.124243443f; // 표현 범위 벗어남 (틀어진 값이 나옴)
//        double b1 = 1.124243443; // 전부 표현
//        System.out.println("f1 = " + f1 + ", b1 = " + b1);

        // 부동 소수점 오차 테스트
//        double sum = 0;
//        double double_num = 0.1;
        // 미세 오차는 조정되어 정상적으로 출력
//        System.out.println(double_num);
        // 반복 연산 시 오차가 확대되어 오차 확인 가능
//        for (int i = 0; i < 1000; i++){
//            sum += double_num * 10;
//        }
//        sum = sum / 10;
//        System.out.println(sum);
//
//        double d1 = 1.03;
//        double d2 = 0.42;
//        System.out.println(d1 - d2);

        // 저장할 때는 문자열 -> 연산할 때는 정수로 변환 -> 최종 결과는 실수로 변환
//        BigDecimal bigDecimal1 = new BigDecimal("1.03");
//        BigDecimal bigDecimal2 = new BigDecimal("0.42");
//        double result = bigDecimal1.subtract(bigDecimal2).doubleValue();
//        System.out.println(result);

        // 문자: char
//        char c = '가';
//        System.out.println(c);

        // boolean: true(1) or false(0)
//        boolean b = true;
//        System.out.println(b);
//        if (b){
//            System.out.println("조건식이 참입니다.");
//        }
//        int bool_num1 = 20;
//        int bool_num2 = 10;
//        if (bool_num1 > bool_num2){
//            System.out.println("조건식이 참입니다.");
//        }

        // 묵시적 타입 변환
//        char ch1 = 'a';
//        int ch1_num = ch1;
//        System.out.println(ch1_num);
        // char형 알파벳 비교를 위한 묵시적 타입 변환이 일어난다
//        System.out.println("A는 B보다 크다: ");
//        System.out.println('A' > 'B');

//        int my_int1 = 10;
        // int -> double 가능
//        double my_double1 = my_int1;
//        System.out.println(my_double1);
        // 에러 발생: my_int1 = my_double1;
        // 명시적 타입은 가능: 소수점 값 손실 발생 가능성이 있음
//        my_int1 = (int) my_double1;
//        double my_double2 = 7.2f;
//        System.out.println("my_double2 = " + my_double2);
        
        // 명시적 타입 변환
//        char my_char2 = 'b';
//        int char_num = (int) my_char2;
        
        // int a가 1, b가 4일 때 둘을 나눈 값을 int c에 담아 출력, double에 담아 출력
//        int int_a = 1;
//        int int_b = 4;
//        int int_c = int_a / int_b;
//        System.out.println("int_c = " + int_c);
//        double double_d = int_c;
//        System.out.println("double_d = " + double_d);
//        double double_d2 = int_a / (double) int_b;
//        System.out.println("double_d2 = " + double_d2);

        // 변수와 상수
        // 선언과 동시에 초기화
//        int a1 = 10;
        // 변수값 변경
//        a1 = 20;
        // 선언만 한 뒤에 나중에 초기화
        int a2; // 지역 변수는 선언만 됐을 땐 값이 0으로 초기화되지 않으나, 객체로 선언할 때는 0으로 초기화
        a2 = 20;
        // 객체로 만들 때는 0으로 초기화
        int[] arr = new int[5];
        System.out.println(arr[0]);
        String[] strArr = new String[5];
        System.out.println(strArr[0]);
        // 상수는 값의 재할당이 불가 (최종본)
//        final int AGES = 20;
        // 상수는 값의 변경이 불가 -> AGES = 30; 에러 발생
        // 상수는 선언만 한 뒤에 나중에 초기화 하는 방식이 java8 이전에는 불가했으나, 이후 가능
//        final int AGES2;
//        AGES2 = 20;

    }
}

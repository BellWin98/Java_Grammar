package basic;

import java.math.BigDecimal;

public class C03Operator {
    public static void main(String[] args) {
        // 산술 연산자
        int num1 = 8, num2 = 3;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / (double)num2));
        System.out.println("num1 % num2 = " + (num1 % num2));
        
        int n4 = 10;
        int n5 = 10;
        n4 %= 3;
        System.out.println("n4 = " + n4);
        n5 /= 3;
        System.out.println("n5 = " + n5);

        // 증감 연산자
        int a = 5;
        int b = a++;
        System.out.println(a); // 6
        System.out.println(b); // 5

        a = 5;
        b = ++a; // 전위 연산자: 실행문이 끝나기 전에 증감
        System.out.println(a); // 6
        System.out.println(b); // 6

        char ch1 = 'a';
        char ch2 = 'A';
        System.out.println(ch1 == ch2);
        System.out.println(ch1 != ch2);

        // 논리 연산자: &&, ||, |
        int op_num1 = 10;
        int op_num2 = 20;
        boolean result1, result2;

        // result1에 num1이 5보다 큰 지 조건과 num1이 20보다 작은지 조건을 and 조건을 통해 boolean에 담기
        result1 = (op_num1 > 5) && (op_num1 < 20);
        System.out.println("result1 = " + result1);
        // result2에 num2가 10보다 작은 조건과 num2가 30보다 작은 조건을 or 조건을 통해 boolean에 담기
        result2 = (op_num2 < 10) || !(op_num2 < 30);
        System.out.println("result2 = " + result2);
        // result1, result2 각각 출력
        // result2에 ! 달아서 출력

        // 비트 연산자: &, 각 자리의 수가 모두 1일 경우에만 1
        System.out.println(2 & 1); // 0
        System.out.println(2 > 0 & 3 > 0); // true

        // 0101 0110
        int n1 = 5, n2 = 6;
        // &(AND) -> 각 자리의 수가 모두 1일 경우에만 1
        System.out.println(n1 & n2); // 4 - 0100
        // |(OR) -> 각 자리의 수가 하나라도 1일 경우 1
        System.out.println(n1 | n2); // 7 - 0111
        // ^(XOR) -> 각 자리의 수가 다를 경우에만 1
        System.out.println(n1 ^ n2); // 3 - 0011
        // ~(NOT) -> 각 자리마다 반대의 숫자 반환
        System.out.println(~n1); // -6 - 1의 보수 적용

        // 쉬프트 연산자: <<, >> -> 곱셈 및 나눗셈의 효과가 발생
        System.out.println(n1 << 10); // 10

        int shift_a = 13; // 00001101
        int shift_b = 9; // 00001001

        while (b != 0){
            int same_index = a & b; // AND연산으로 구한 carry 값 생성 -> 1001
            a = a ^ b; // XOR연산으로 구한 비트값 a에 할당 ->
            b = same_index << 1;
        }
    }
}

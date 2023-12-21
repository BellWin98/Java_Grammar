package advanced.c12class_method_recur;

import java.util.Arrays;

public class C12RecursiveBasic {
    public static void main(String[] args) {
//        // for문을 이용해서 1~10까지 누적 합계 구하기
//        int sum = 0;
//        for (int i = 10; i >= 1; i--){
//            sum += i;
//        }
//        System.out.println(sum);
//        System.out.println(addAcc(10));
//
//        // 누적 곱하기 값 (팩토리얼): 10*9* ... *1
//        System.out.println(factorial(10));

        // for문 피보나치 (배열)
        // 메모이제이션(기억 알고리즘) - DP: 계산 결과값을 저장해둠
        // 단계마다 계산 결과값이 필요할 때 메모이제이션 활용
        int[] fiboArr = new int[10];
        fiboArr[0] = 1;
        fiboArr[1] = 1;
        for (int i = 2; i < fiboArr.length; i++){
            fiboArr[i] = fiboArr[i - 1] + fiboArr[i - 2];
        }

        // for문 피보나치 (배열 X)
        int first = 1;
        int second = 1;
        for (int i = 2; i < 10; i++){
            int third = first + second;
            first = second;
            second = third;
        }


        System.out.println(Arrays.toString(fiboArr));
        System.out.println(fibonacci(9));

    }

    // 메서드가 자기 자신을 호출하는 메서드를 재귀함수라 하며,
    // 이러한 호출 방식을 재귀 호출이라한다.
    static int addAcc(int n){
        if (n == 1){
            return 1;
        }
        return n + addAcc(n - 1);
    }

    static int factorial(int n){
        if (n < 2){
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int fibonacci(int n){
        if (n <= 1){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

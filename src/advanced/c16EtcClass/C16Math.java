package advanced.c16EtcClass;

public class C16Math {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            // 0.0 ~ 1.0 미만의 양의 double 형을 반환
            double randomValue = Math.random();
            System.out.println((int)(randomValue * 100));
        }

        // abs() 메서드: 절대값 반환
        System.out.println(Math.abs(-5));

        // floor(): 소수점 내림, ceil(): 소수점 올림, round(): 소수점 반올림
        System.out.println(Math.floor(5.7));
        System.out.println(Math.ceil(5.7));
        System.out.println(Math.round(5.7));

        // max, min
        System.out.println(Math.max(5, 8));
        System.out.println(Math.min(5, 8));

        // pow(a, b): 제곱 연산 수행 -> a의 b제곱
        System.out.println(Math.pow(5, 2));

        // sqrt(a): 제곱근 연산 수행
        System.out.println(Math.sqrt(25));


    }
}

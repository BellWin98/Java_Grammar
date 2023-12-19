package advanced.class_method_recur;

public class C12MethodPractice {
    public static void main(String[] args) {
        // 소수: 1과 자기 자신을 제외하고 약수가 없는 숫자
        // 소수인지 아닌지 판별하는 메서드 생성
        // 리턴타입 boolean: 소수이면 true, 아니면 false
        // main 메서드에서 호출하여 테스트
        int number = 10;
        if (isPrime(number)){
            System.out.println(number + "는 소수입니다.");
        } else {
            System.out.println(number + "는 소수가 아닙니다.");
        }
    }

    public static boolean isPrime(int number){
        if (number == 1){
            return false;
        }
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void isPrimePrint(int number){
        if (number == 1){
            return;
        }
        for (int i = 2; i*i <= number; i++) {
            if (number % i == 0) {
                // void 리턴 타입 메서드에서도 강제 종료를 위해 return 사용 가능
                System.out.println("소수가 아닙니다.");
                return;
            }
        }
    }
}

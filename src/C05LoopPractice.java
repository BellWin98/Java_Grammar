public class C05LoopPractice {
    public static void main(String[] args) {
        // 1~20까지 짝수의 합 계산 하기
//        int sum = 0;
//        for (int i = 1; i <= 20; i++){
//            if (i % 2 == 0){
//                sum += i;
//            }
//        }
//        System.out.println(sum);

        // 숫자 뒤집기
//        int num = 1234;
//        int answer = 0;
//        while (true){
//            answer += num % 10;
//            answer *= 10;
//            num /= 10;
//            if (num == 0){
//                answer /= 10;
//                break;
//            }
//        }
//        System.out.println(answer);

        // 강사님
//        int num = 1234;
//        int answer = 0;
//        while (true){
//            int temp = num % 10;
//            answer = answer * 10 + temp;
//            num /= 10;
//            if (num == 0){
//                break;
//            }
//        }
//        System.out.println(answer);

        // 최대공약수 구하기
//        int a = 24;
//        int b = 36;
//        int max = 0;
//        for (int i = 1; i < a; i++){
//            if (a % i == 0 && b % i == 0){
//                max = i;
//            }
//        }
//        System.out.println(max);

        // 강사님
//        int a = 24; int b = 36;
//        int num = a > b ? b : a;
//        int max_num = 0;
//        for (int i = 1; i <= num; i++){
//            if (a % i == 0 && b % i == 0){
//                max_num = i;
//            }
//        }
//        int min_num = max_num * a / max_num * b / max_num;
//        System.out.println(max_num);
//        System.out.println(min_num);

        // 라벨문 활용 1
        // 1. target이 matrix에 i, j번째 배열에 있는 지 출력
        // 2. target을 찾으면 반복문 전체 종료
//        int[][] matrix = {{1,2,3,4}, {5,6,7}, {8,9}, {10,11,12,13,14}};
//        int target = 11;
//        loop1:
//        for (int i = 0; i < matrix.length; i++){
//            for (int j = 0; j < matrix[i].length; j++){
//                if (matrix[i][j] == target){
//                    System.out.println(i + "," + j + "번째 배열에 위치");
//                    break loop1;
//                }
//            }
//        }

        // 1 ~ 20 숫자가 있을 때, 약수가 5개 이상인 숫자 중 가장 작은 값 구하기
        // 불필요한 반복 X
        loop1:
        for (int i = 1; i <= 20; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count >= 5) {
                    System.out.println("1 ~ 20 숫자 중, 약수가 5개 이상인 숫자 중 가장 작은 값");
                    System.out.println(i);
                    break loop1;
                }
            }
        }
    }
}

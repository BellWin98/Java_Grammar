import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {
        // 2 ~ 10까지 출력
//        int a = 2;
//        while (a < 11){
//            System.out.println(a);
//            a++;
//        }
//        while (true){
//            Scanner sc = new Scanner(System.in);
//            System.out.print("구구단 단수를 입력해주세요: ");
//            int userInput = sc.nextInt();
//            int count = 1;
//            while (count < 10){
//                System.out.println(userInput + " X " + count + " = " + userInput * count);
//                count++;
//            }
//        }

        // 도어락 비밀번호 맞추면 반복이 종료되고, 그렇지 않으면 계속 질문
        // 최대 5번까지만 비밀번호 입력 가능하도록 => 입력횟수를 초과했습니다 문구

//        int count = 5;
//        String password = "1234";
//        while (count > 0) {
//            count--;
//            Scanner sc = new Scanner(System.in);
//            System.out.print("도어락 비밀번호를 입력해주세요: ");
//            String userInput = sc.nextLine();
//            if (userInput.equals(password)){
//                System.out.println("문이 열렸습니다.");
//                break;
//            } else {
//                System.out.println("비밀번호가 틀렸습니다.");
//                System.out.println("남은 시도 횟수: " + count);
//            }
//            if (count == 0){
//                System.out.println("입력횟수를 초과했습니다.");
//            }
//        }
//        do {
//            count--;
//            Scanner sc = new Scanner(System.in);
//            System.out.print("도어락 비밀번호를 입력해주세요: ");
//            String userInput = sc.nextLine();
//            if (userInput.equals(password)){
//                System.out.println("문이 열렸습니다.");
//                break;
//            } else {
//                System.out.println("비밀번호가 틀렸습니다.");
//                System.out.println("남은 시도 횟수: " + count);
//            }
//            if (count == 0){
//                System.out.println("입력횟수를 초과했습니다.");
//            }
//        } while (count > 0);

        // for문을 통해 2~10까지 출력
//        for (int i = 2; i <= 10; i++){
//            System.out.println(i);
//        }

        // continue를 사용해서 홀수만 출력되도록 (1~10 숫자 중에서)
//        for (int i = 1; i < 10; i++){
//            if (i % 2 == 0){
//                continue;
//            }
//            System.out.println(i);
//        }

        // 배열과 enhance for 문
//        int[] arr = {1,5,7,9,10};

        // 일반 for 문
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

        // enhance for 문 (set, map은 이걸로만 출력 가능 - 순서가 없기 때문에)
//        for (int number : arr){
//            System.out.println(number);
//        }

        // 일반 for문을 통해 arr의 값에 10씩 더한 뒤에 출력
        // 출력 시 Arrays.toString(arr)
//        for (int i = 0; i < arr.length; i++){
//            arr[i] += 10;
//        }
//        System.out.println(Arrays.toString(arr));

        // enhance for문을 통해 arr의 값에 10씩 더한 뒤에 출력 -> 안 더해짐. 복사본이라고 생각. 값을 가져올 때만 사용
//        for (int number : arr){
//            number += 10;
//        }
//        System.out.println(Arrays.toString(arr));

        // 자바 변수의 유효 범위: { }
//        int num = 10;
//        if (num > 1){
//            int abc = 20;
//            num = 20;
//        }
//        System.out.println(num); // if문 밖에서 선언된 변수 값을 if안에서 접근하여 변경하는 것은 가능
        // System.out.println(abc); // if문 안에서 정의된 변수는 밖에서 인지 불가

        // 다중 반복문
        // 2~9단 전부 출력, 0단 입니다 출력.

//        for (int i = 2; i < 10; i++){
//            System.out.println(i + "단 입니다.");
//            for (int j = 1; j < 10; j++){
//                System.out.println(i + " X " + j + " = " + i * j);
//            }
//        }
        // 2중 for문을 통해 배열 접근
//        int[][] arr = {{1,2,3,4}, {5,6,7,8}};
//        // 외부 배열 순회
//        for (int i = 0; i < arr.length; i++) {
//            // 내부 배열 순회
//            for (int j = 0; j < arr[i].length; j++){
//                System.out.print(arr[i][j]);
//            }
//        }

        // 라벨문
        loop1:
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.println("hello world");
                if (j == 2) {
                    break loop1; // 상위 for 문 종료
                }
            }
        }
    }
}

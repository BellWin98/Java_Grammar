package advanced.c15anonymous_lambda;

import java.util.Arrays;

public class C15StreamAPI1 {
    public static void main(String[] args) {
        int[] arr = {20, 10, 4, 12};

        // 전통적인 방식의 데이터 접근 방식
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        // 데이터와 객체 중심이 아닌, 입력에 따른 출력 만이 존재하는 함수형 프로그래밍 방식
        // java에서 함수형 프로그래밍을 지원하기 위한 라이브러리 -> Stream API
        // foreach : 스트림의 각 요소를 소모하면서 동작을 수행
        // 원본 데이터에 직접 접근하지 않음. -> 연산 수행 후 원본에 아무런 영향이 없음
        // 입력과 출력만이 존재
        Arrays.stream(arr).forEach(a -> System.out.println(a));
        Arrays.stream(arr).sorted().forEach(a -> System.out.println(a));

        String[] myArr = {"world", "hello", "java"};
        String[] newMyArr = Arrays.stream(myArr).sorted().toArray(String[]::new);
        // 길이 4이하 문자열만 출력
        Arrays.stream(myArr).filter(a -> a.length() <= 4).forEach(a -> System.out.println(a));
        System.out.println(Arrays.toString(newMyArr));

        int[] intArr = {1,2,3,4,5,6};
        int answer = Arrays.stream(intArr).sum();
        System.out.println(answer);
    }
}

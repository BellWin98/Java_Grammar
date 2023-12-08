import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C07Array {
    public static void main(String[] args) {
        // 표현식 1
//        int[] intArr1 = {1,2,3,4};

        // 표현식 2
//        int[] intArr2 = new int[4];
//        intArr2[0] = 1;
//        intArr2[1] = 2;
//        intArr2[2] = 3;
//        intArr2[3] = 4;

        // 표현식 3
//        int[] intArr3 = new int[]{1,2,3,4};

        // 표현식 4는 불가: java의 배열은 반드시 길이가 지정되어야 함
//        int[] intArr4 = new int[];

//        String[] arr_str = new String[5];
//        for (int i = 0; i < arr_str.length; i++){
//            if (arr_str[i].isEmpty()){
//                System.out.println("비어있습니다.");
//            }
//        }

        // 85, 65, 90 인 int 배열을 선언한 뒤, 총합 및 평균값 계산
//        int[] arr = {85, 65, 90};
//        int sum = 0;
//        for (int number : arr){
//            sum += number;
//        }
//        System.out.println("총합: "+ sum + ", 평균값: " + (double) sum / arr.length);

        // 최댓값, 최솟값
//        int[] arr = {10, 20, 30, 12, 8, 17};
//        int max = arr[0];
//        int min = arr[0];
//        for (int number : arr){
//            if (number > max){
//                max = number;
//            }
//            if (number < min){
//                min = number;
//            }
//        }
//        System.out.println("최댓값: " + max + ", 최솟값: " + min);

        // 배열의 순서 바꾸기
//        int[] arr = {10, 20};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//        System.out.println(Arrays.toString(arr));

        // 0번째 index부터 마지막까지 자리 change
//        int[] arr2 = {10,20,30,40,50,60,70};
//        for (int i = 0; i < arr2.length - 1; i++){
//            int temp = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp;
//        }
//        System.out.println(Arrays.toString(arr2));

        // 배열 뒤집기 1
        // 신규 배열 선언
//        int[] arr = {1,2,3,4,5};
//        int[] answer = new int[arr.length];
//        for (int i = 0; i < arr.length; i++){
//            answer[i] = arr[arr.length - 1 - i];
//        }
//        System.out.println(Arrays.toString(answer));

        // 배열 뒤집기 2
        // 반 잘라서 첫 인덱스와 마지막 인덱스를 교체하여 반복 횟수 줄이는 방법
//        int[] arr = {1,2,3,4,5};
//        for (int i = 0; i < arr.length / 2; i++){
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

        // 정렬: sort() 함수 사용
        int[] arr = {5,1,8,3,9,6,4,4,3};

        // 오름차순 정렬
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        // 내림차순
        // 방법 1: Comparator 클래스 사용
        // 객체 타입인 경우에만 Comparator 클래스 사용 가능
        String[] strArr = {"hello", "hi", "bye", "goodmorning"};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(strArr));
        // Comparator 클래스는 기본형 타입은 처리 불가
//        Arrays.sort(arr, Comparator.reverseOrder());

        // 방법 2: 배열 뒤집기
        for (int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));

        // StreamApi, lambda를 활용한 내림차순 정렬
        int[] arr2 = {5,1,8,3,9,6,4,4,3};
        int[] reverseOrderArr2 = Arrays.stream(arr2) // arr2를 대상으로 stream 객체 생성 (복사 뜸)
                                .boxed() // int를 Integer로 형변환한 스트림 객체 생성 (박싱)
                                .sorted(Comparator.reverseOrder()) // 내림차순 정렬
                                .mapToInt(Integer::intValue) // Integer를 int로 변환
                                .toArray(); // int[]로 변환
        System.out.println(Arrays.toString(reverseOrderArr2));
    }
}

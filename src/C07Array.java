import javax.naming.PartialResultException;
import java.sql.SQLOutput;
import java.util.*;

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
//        int[] arr = {5,1,8,3,9,6,4,4,3};

        // 오름차순 정렬
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        // 내림차순
        // 방법 1: Comparator 클래스 사용
        // 객체 타입인 경우에만 Comparator 클래스 사용 가능
//        String[] strArr = {"hello", "hi", "bye", "goodmorning"};
//        Arrays.sort(strArr);
//        System.out.println(Arrays.toString(strArr));
//        Arrays.sort(strArr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(strArr));
        // Comparator 클래스는 기본형 타입은 처리 불가
//        Arrays.sort(arr, Comparator.reverseOrder());

        // 방법 2: 배열 뒤집기
//        for (int i = 0; i < arr.length / 2; i++){
//            int temp = arr[i];
//            arr[i] = arr[arr.length - i - 1];
//            arr[arr.length - i - 1] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

        // StreamApi, lambda를 활용한 내림차순 정렬
//        int[] arr2 = {5,1,8,3,9,6,4,4,3};
//        int[] reverseOrderArr2 = Arrays.stream(arr2) // arr2를 대상으로 stream 객체 생성 (복사 뜸)
//                                .boxed() // int를 Integer로 형변환한 스트림 객체 생성 (박싱)
//                                .sorted(Comparator.reverseOrder()) // 내림차순 정렬
//                                .mapToInt(Integer::intValue) // Integer를 int로 변환
//                                .toArray(); // int[]로 변환
//        System.out.println(Arrays.toString(reverseOrderArr2));

        // 선택정렬: 가장 작은 수 찾아서 작은 인덱스에 넣기
//        int[] numberList1 = {30, 22, 20, 25, 12};
//        int[] numberList2 = {30, 22, 20, 25, 12};
//
//        // 오름차순 선택정렬
//        for (int i = 0; i < numberList1.length - 1; i++){
//            for (int j = i + 1; j < numberList1.length; j++){
//                if (numberList1[i] > numberList1[j]) {
//                    int temp = numberList1[i];
//                    numberList1[i] = numberList1[j];
//                    numberList1[j] = temp;
//                }
//            }
//        }
//
//        // 내림차순 선택정렬
//        for (int i = 0; i < numberList2.length - 1; i++){
//            for (int j = i + 1; j < numberList2.length; j++){
//                if (numberList2[i] < numberList2[j]) {
//                    int temp = numberList2[i];
//                    numberList2[i] = numberList2[j];
//                    numberList2[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(numberList1));
//        System.out.println(Arrays.toString(numberList2));

        // 숫자 조합의 합: 각기 다른 숫자의 배열이 있을 때, 만들어질 수 있는 2개의 조합의 합을 출력하라
        // 조합: 중복 X
//        int[] intArr = {10, 20, 30, 40, 50, 60};
////        for (int i = 0; i < intArr.length - 1; i++){
////            for (int j = i + 1; j < intArr.length; j++){
////                int sum = intArr[i] + intArr[j];
////                System.out.println(intArr[i] + " + " + intArr[j] + " = " + sum);
////            }
////        }

        // 중복 제거하기
//        int[] temp = {10, 10, 40, 5 ,7};
//        int[] answer = new int[temp.length];
//        int count = 0;
//
//        Arrays.sort(temp);
//        for (int i = 0; i < temp.length; i++) {
//            if (i == temp.length - 1) {
//                answer[count] = temp[i];
//                count++;
//                break;
//            }
//            if (temp[i] != temp[i + 1]) {
//                answer[count] = temp[i];
//                count++;
//            }
//        }
//
//        answer = Arrays.copyOfRange(answer, 0, count);
//        System.out.println(Arrays.toString(answer));

        // 두 개 뽑아서 더하기 (프로그래머스)

        // 버블 정렬
        // 내 풀이
//        int[] bubbleArr = {5, 3, 6, 10, 7};
//        for (int i = bubbleArr.length - 1; i > 0; i--){
//            for (int j = 0; j < i; j++){
//                if (bubbleArr[j] > bubbleArr[j + 1]){
//                    int temp = bubbleArr[j];
//                    bubbleArr[j] = bubbleArr[j + 1];
//                    bubbleArr[j + 1] = temp;
//                }
//            }
//        }

        // 강사님 풀이
        // 효율 극대화

//        for (int i = 0; i < bubbleArr.length - 1; i++){
//            boolean isChanged = false;
//            for (int j = 0; j < bubbleArr.length - 1 - i; j++){
//                if (bubbleArr[j] > bubbleArr[j+1]) {
//                    int temp = bubbleArr[j];
//                    bubbleArr[j] = bubbleArr[j + 1];
//                    bubbleArr[j + 1] = temp;
//                    isChanged = true;
//                }
//            }
//            if (isChanged == false){
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(bubbleArr));

        // 배열의 검색
//        int[] arr = {5, 3, 1, 8, 7};
//        int answer = 0;
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] == 8){
//                answer = i;
//                break;
//            }
//        }
//        System.out.println(answer);

        // 이진 탐색 (Binary Search)
        // 사전에 정렬이 되어 있어야 이진 탐색 가능
//        int[] binaryArr = {1, 3, 4, 4, 9, 9, 11, 13};
//        int answer = Arrays.binarySearch(binaryArr, 9);
//        System.out.println(answer);
//
//        // 배열 간 비교: equals (순서까지 동일해야 true)
//        int[] arr1 = {10, 20, 30};
//        int[] arr2 = {10, 20, 30};
//        System.out.println(Arrays.equals(arr1, arr2));

        // 배열 복사: copyOf(배열, end), copyOfRange(배열, start, end)
        // copyOf: 처음부터 endIndex까지, 대상 배열을 넘어서는 경우 초기값으로 세팅되어 endIndex만큼의 배열의 길이로 세팅
//        int[] arr = {10, 20, 30, 40, 50};
//        int[] newArr1 = Arrays.copyOf(arr, 10);
//        int[] newArr2 = Arrays.copyOfRange(arr, 1, 4);
//        System.out.println(Arrays.toString(newArr1));
//        System.out.println(Arrays.toString(newArr2));

        // 2차원 배열 할당
//        int[][] arr = new int[2][3];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;
//
//        System.out.println(Arrays.deepToString(arr));
//
//
//        // 2차원 가변 배열 선언 및 할당
//        int[][] arr2 = new int[3][]; // 전체 사이즈는 지정, 내부 배열은 나중에 꼭 초기화해줄 것
//        arr2[0] = new int[1];
//        arr2[1] = new int[2];
//        arr2[2] = new int[3];
////        arr2[0][0] = 10; // NPE 오류 남
////        arr2[1][0] = 20;
////        arr2[2][0] = 30;
//        System.out.println(Arrays.deepToString(arr2));
//
//        // 가변 배열 리터럴 방식
//        int[][] arr3 = {{10}, {10, 20}, {10, 20, 30}};

        // [3][4] 사이즈의 배열을 선언한 뒤, 1,2,3 ~ 12까지의 숫자값을 각 배열에 할당

//        int[][] arr = new int[3][4];
//        int value = 1;
//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[i].length; j++){
//                arr[i][j] = value;
//                value++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));

        // 가변 배열 만들기: 전체 사이즈 - 5
        // 각 배열마다 사이즈 1,2,3,4,5로 커지도록:  for문
        // 각 사이즈 별로 1은 10이 모두 들어가고, 2는 20이 모두 들어가고 3은 30 ...
        // 내 풀이
        int[][] arr = new int[5][];
        int count = 1;
        for (int i = 0; i < arr.length; i++){
            arr[i] = new int[count];
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = count * 10;
            }
            count++;
        }
        System.out.println(Arrays.deepToString(arr));
    }
}

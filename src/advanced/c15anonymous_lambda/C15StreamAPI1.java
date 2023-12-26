package advanced.c15anonymous_lambda;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C15StreamAPI1 {
    public static void main(String[] args) {
//        int[] arr = {20, 10, 4, 12};
//
//        // 전통적인 방식의 데이터 접근 방식
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//
//        // 데이터와 객체 중심이 아닌, 입력에 따른 출력 만이 존재하는 함수형 프로그래밍 방식
//        // java에서 함수형 프로그래밍을 지원하기 위한 라이브러리 -> Stream API
//        // foreach : 스트림의 각 요소를 소모하면서 동작을 수행
//        // 원본 데이터에 직접 접근하지 않음. -> 연산 수행 후 원본에 아무런 영향이 없음
//        // 입력과 출력만이 존재
//        Arrays.stream(arr).forEach(a -> System.out.println(a));
//        Arrays.stream(arr).sorted().forEach(a -> System.out.println(a));
//
//        String[] myArr = {"world", "hello", "java"};
//        int[] intArr = {1,2,3,4,5,6};
//        // toArray로 새로운 배열 생성
//        // String은 레거시와 호환해주기 위해 toArray안에 특정 작업을 해주어야 함
//        String[] newMyArr = Arrays.stream(myArr).sorted().toArray(String[]::new);
//        // int는 별도 작업 필요 없음 (int 관련 연산할 때 IntStream 인터페이스가 따로 제공된다.)
//        int[] newIntArr = Arrays.stream(intArr).filter(a -> a >= 4).toArray();
//        // 길이 4이하 문자열만 출력
//        Arrays.stream(myArr).filter(a -> a.length() <= 4).forEach(a -> System.out.println(a));
//        System.out.println(Arrays.toString(newMyArr));
//        int answer = Arrays.stream(intArr).sum();
//        System.out.println(answer);
//
//        // 스트림의 생성
//        String[] strArr = {"HTML", "CSS", "JAVA", "PYTHON"};
//
//        // Stream<객체>: 제네릭<> 타입으로 stream 객체 생성
//        Stream<String> strStream = Arrays.stream(strArr);
//
//        // int의 stream 리턴 타입은 IntStream이다.
//        int[] int2Arr = {10, 20, 30, 40, 50};
//        IntStream intStream = Arrays.stream(int2Arr);
//        int[] newInt2Arr = intStream.filter(a -> a > 20).toArray();
//        System.out.println(Arrays.toString(newInt2Arr));
//
//        // 참조 변수의 스트림 변환의 경우, 제네릭의 타입 소거 문제 발생
//        // 제네릭의 타입 소거: java 버전의 호환성(안전성)을 위해 제네릭 타입을 런타임 시점에 제거하는 것을 의미
//        // 배열의 크기는 익명 변수로 지정
////        String[] newStrArr = strStream.filter(a -> a.length() <= 4).toArray(a -> new String[a]);
//        // 일반적으로 메서드 참조 방식으로 표현함
//        // 메서드 참조 방식: 클래스::메서드
//        // 생성자도 메서드의 일종이므로, new도 메서드 자리에 올 수 있음
//        String[] newStrArr = strStream.filter(a -> a.length() <= 4).toArray(String[]::new);
//        System.out.println(Arrays.toString(newStrArr));

//
//        // stream 중개 연산: filter, map, sorted, distinct
//
//        // distinct: 중복 제거 후 스트림 반환
//        int[] int3Arr = {10, 10, 30, 30, 50, 60};
//        // 중복 제거 후 요소들의 합 반환
//        System.out.println(Arrays.stream(int3Arr).distinct().sum());
//
//        String[] strArr2 = {"java", "java", "python", "C++"};
//        // 중복 제거 후 새로운 배열 생성
//        String[] newStrArr2 = Arrays.stream(strArr2).distinct().toArray(String[]::new);
//        System.out.println(Arrays.toString(newStrArr2));
//
//        // 중복 제거하고 길이가 3개 이하로 제한하고, 남은 배열의 길이 총합
//        // mapToInt를 통해 Intstream으로 변환 (sum()을 사용하기 위함)
//        IntStream intStream1 = Arrays.stream(strArr2).distinct().filter(a -> a.length() <= 3).mapToInt(a -> a.length());
//        System.out.println(intStream1.sum());
//
//        // sorted: 정렬된 스트림 반환
//        int[] int4Arr = {4,1,2,3,5,6,7,8,11,20};
//
//        // 내림차순 정렬된 숫자 신규 배열 반환
//        int[] newInt4Arr = Arrays.stream(int4Arr).sorted().toArray();
//
//        List<Integer> myList = new ArrayList<>(Arrays.asList(6,1,2,3,1,6));
//        // collect: 변환할 컬렉션 객체 명시
//        List<Integer> myNewList = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(myNewList);
//
//        List<String> stList = new ArrayList<>(Arrays.asList("java", "python", "C++", "javascript"));
//        // 문자열의 길이가 4개 이상인 문자열의 길이를 기준으로 내림차순 정렬하여 신규 List 생성
//        List<String> stNewList = stList.stream().filter(a -> a.length() >= 4).sorted((o1, o2) -> o2.length() - o1.length()).collect(Collectors.toList());
//        System.out.println(stNewList);
//
//        int[] arrPlus10 = {10, 20, 30, 40, 50, 60};
//        System.out.println(Arrays.toString(Arrays.stream(arrPlus10).map(a -> a + 10).toArray()));
//
//        // arr에서 짝수만 골라서 해당 수의 제곱의 총합을 구하라 sum()
//        int answer2 = Arrays.stream(int4Arr).filter(a -> a % 2 == 0).map(a -> a * a).sum();
//        System.out.println(answer2);
//
//        // 스트림 소모: forEach, reduce
//        Arrays.stream(arrPlus10).forEach(System.out::println);
//
//        // 초기값을 지정하지 않으면 Optional 객체 return
//        // Optional 객체: 값이 있을 수도 있고, 없을 수도 있다는 것을 명시한 타입 (java 8 이후 추가)
////        int result = Arrays.stream(arrPlus10).reduce((a, b) -> a * b);
////        String a = null;
////        System.out.println(a.length());
////        Optional<String> myOptional = Optional.ofNullable("hello");
////        if (myOptional.isPresent()){
////            System.out.println(myOptional.get().length());
////        }
//        // 누적곱
//        int result = Arrays.stream(arrPlus10).reduce(1, (a,b) -> a*b);
//        System.out.println(result);
//
//        // 누적합
//        int sum = Arrays.stream(arrPlus10).reduce((a,b) -> a+b).getAsInt();
//        System.out.println(sum);
//        OptionalInt sum = Arrays.stream(arrPlus10).reduce((a,b) -> a+b);
//        if (sum.isPresent()){
//            System.out.println(sum.getAsInt());
//        }
//
//
//        String[] stArr = {"hello", "java", "world"};
////        String answer = Arrays.stream(stArr).reduce((a, b) -> a + ", "+ b).get();
//        Optional<String> answer = Arrays.stream(stArr).reduce((a, b) -> a + ", "+ b);
//        if (answer.isPresent()){
//            System.out.println(answer.get());
//        }
////        System.out.println(answer);

        // 최소(min) / 최대(max) / 평균(average) / 총합(sum) / 개수(count)
        // IntStream에 위 함수들이 있으므로, mapToInt를 사용해야 함
//        List<Integer> numList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        int sum = numList.stream().mapToInt(a -> a).sum();
//        OptionalInt min = numList.stream().mapToInt(a -> a).min();
//        OptionalInt max = numList.stream().mapToInt(a -> a).max();
//        OptionalDouble average = numList.stream().mapToInt(a -> a).average();
//        long count = numList.stream().filter(a -> a >= 3).count();
//
//        System.out.println("min: " + min.getAsInt() + ", max: " + max.getAsInt() + ", average: " + average.getAsDouble() + ", sum: " + sum + ", count: " + count);

        // findFirst()
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("han", 26));
//        students.add(new Student("kim", 32));
//        students.add(new Student("lee", 35));
//        students.add(new Student("hong", 54));
//        students.add(new Student("jang", 43));

//        Student s1 = students.stream().filter(a -> a.getAge() >= 30).findFirst().get();
//        System.out.println(s1);

        /**
         * Student 객체 실습
         * 1. 가장 나이 어린 사람 찾기
         * 2. 30대가 몇명인지 출력
         * 3. 모든 객체의 평균 나이 출력
         * 4. 30세 이하 선착순 누구인지 출력
         */
//        System.out.println("가장 나이 어린 사람: " + students.stream().min((o1, o2) -> o1.getAge() - o2.getAge()).get());
//        System.out.println("가장 나이 어린 사람: " + students.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).findFirst().get());
//        System.out.println("30대 명수: " + students.stream().filter(a -> a.getAge() / 10 == 3).count());
//        System.out.println("모든 사람의 평균 나이: " + students.stream().mapToInt(a -> a.getAge()).average().getAsDouble());
//        System.out.println("30세 이하인 사람 중 선착순 1위는: " + students.stream().filter(a -> a.getAge() <= 30).findFirst().get());

        // 기존의 java의 null
//        String st = null;
//        if (st != null){
//            System.out.println(st.compareTo("abc"));
//        }

        // java8 이후에 나온 Optional 객체를 통해 특정 객체에 값이 없을 지도 모른다는 것을 명시적으로 표현
        // Optional 객체에 빈 값을 명시적으로 넣는 방법: Optional.empty();
//        Optional<String> opt1 = Optional.empty();
//        opt1.get();
        // 빈 값인지 아닌지 체크하는 메서드: isPresent();
//        System.out.println(opt1.get().compareTo("abc"));

//        if(opt1.isPresent()){
//            System.out.println(opt1.get().compareTo("abc"));
//        } else {
//            System.out.println("값이 없습니다.");
//        }

        // Optional 객체 생성
//        Optional<String> opt2 = Optional.ofNullable("hello"); // null이 있을 수도 있음을 의미
//        Optional<String> opt2 = Optional.ofNullable(null);

        // orElse 관련 메서드 사용하여 null(빈 값) 처리
        // orElse(), orElseGet(), orElseThrow()

        // orElse(): 값이 있으면 해당 값 return, 없으면 default 지정값 return
//        System.out.println(opt1.orElse("").compareTo("abc"));

        // orElseGet(): 값이 있으면 해당 값 return, 없으면 매개변수로 람다함수 또는 메서드 참조 실행
//        System.out.println(opt1.orElseGet(String::new).compareTo("abc"));

        // orElseThrow(): 값이 있으면 해당 값 return, 없으면 지정된 예외 강제 발생
//        int result = opt2.orElseThrow(() -> new NoSuchElementException("객체에 값이 없습니다.")).compareTo("abc");
//        int result = opt2.orElseThrow(NoClassDefFoundError::new).compareTo("abc"); // 메서드 참조 방식
//        System.out.println(result);

        // OptionalInt, OptionalDouble
//        OptionalInt oi = new ArrayList<>(Arrays.asList(1,2,3,4)).stream().mapToInt(a -> a).max();

        // 방법 1: isPresent()로 check
//        if (oi.isPresent()){
//            System.out.println(oi.getAsInt());
//        }

        // 방법 2: orElse 등의 방법 활용
//        System.out.println(oi.orElseThrow(() -> new NoSuchElementException("no value")));

        // stream API는 디버깅이 어려움. 내부 동작 과정을 체크하기 어렵다. (stream의 peek함수 사용)
    }
}

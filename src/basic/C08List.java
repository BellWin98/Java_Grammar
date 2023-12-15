package basic;

import java.util.*;
import java.util.stream.Collectors;

public class C08List {
    public static void main(String[] args) {
        // List 선언 방법
        // 가장 일반적인 방식
        // 왼쪽엔 인터페이스, 오른쪽엔 구현체
//        List<String> myList = new ArrayList<>();
//
//        // 초기값 생성 방법 1
//        myList.add("java");
//        myList.add("python");
//        myList.add("c++");
//        System.out.println(myList);
//
//        // 초기값 생성 방법 2, 한꺼번에 add (배열을 이용한 변환)
//        String[] myArr1 = {"java", "python", "c++"};
//        List<String> myList2 = new ArrayList<>(Arrays.asList(myArr1));
//
//        // 배열이 int인 경우: 형변환 이슈 발생
//        int[] myIntArr1 = {1,2,3};
//        List<Integer> myIntList = new ArrayList<>();
//        for (int a : myIntArr1){
//            myIntList.add(a);
//        }
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(1, 15); // 중간에 값 삽입은 기본적으로 성능 저하
//        System.out.println(myList);
//
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(30);
//        myList2.add(40);
//        myList2.add(50);
//
//        myList.addAll(myList2);
//        System.out.println(myList);
//
//        // get(int index) : 특정 위치의 요소를 반환
//        // size() : 리스트의 개수 반환
////        for (int i = 0; i < myList.size(); i++){
////            System.out.println(myList.get(i));
////        }
//
//        // remove: 요소 삭제
//        // remove는 value 및 index를 통한 삭제가 가능
//        // remove를 통한 index 삭제: 0번째
//        Integer value = myList.remove(0);

//        // 객체를 통한 삭제: Integer.valueOf() // 값 중복 시 먼저 나오는 값 삭제
//        myList.remove(Integer.valueOf(15));
//        System.out.println(value);
//        System.out.println(myList);
//
//        // set(int index, E element): 특정 index의 값 변경
//        // 마지막 자리값: 100으로 세팅
//        myList.set(myList.size() - 1, 100);
//        System.out.println(myList);
//
//        // contains(E element) : 특정 값이 있는 지 boolean 반환
//        System.out.println(myList.contains(20));

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//
//        // indexOf(): 몇번째 index에 위치하는 지 return, 요소가 없으면 -1 return
//        // 동일 숫자가 있으면 첫번째 index값 return
//        System.out.println(myList.indexOf(20)); // value 값이 들어옴
//
//        // isEmpty(): 값 존재 여부 확인
//        System.out.println(myList.isEmpty());
//        // 전체 삭제: clear()
//        myList.clear();
//        System.out.println(myList.isEmpty());
//        System.out.println(myList);

        // 리스트 출력
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[5]);
//        myList.add(new int[3]);
//        myList.add(new int[4]);
//
//        myList.get(1)[0] = 10;
//        myList.get(1)[1] = 20;
//
//        for (int i = 0; i < myList.size(); i++){
//            System.out.println(Arrays.toString(myList.get(i)));
//        }
//
//        for (int[] a : myList){
//            System.out.println(Arrays.toString(a));
//        }

//        List<List<Integer>> myList1 = new ArrayList<>();
//        myList1.add(new ArrayList<>(Arrays.asList(1,2,3)));
//        myList1.add(new ArrayList<>(Arrays.asList(10,20,30)));
//        myList1.add(new ArrayList<>(Arrays.asList(100,200,300)));
//        myList1.add(new ArrayList<>());
//        myList1.add(new ArrayList<>());
//        myList1.add(new ArrayList<>());
//        for (int i = 0; i < myList1.size(); i++){
//            myList1.get(i).add(10);
//        }
//        System.out.println(myList1);

//        List<int[]> myList = new ArrayList<>(); // 변수명 생략
//        List<List<Integer>> myList1 = new ArrayList<>();
//        myList1.add(new ArrayList<>(Arrays.asList(1,2,3)));
//        myList.add(new int[]{1,2,3});
//        myList.add(new int[3]);
//        myList.add(new int[3]);
//
//        // 위 list에 값 1,2,3 / 10,20,30 / 100,200,300
//
//        int value = 1;
//        for (int i = 0; i < myList.size(); i++){
//            for (int j = 0; j < myList.get(i).length; j++){
//                myList.get(i)[j] = (j+1) * value;
//            }
//            value *= 10;
//        }
//        for (int[] a : myList){
//            System.out.println(Arrays.toString(a));
//        }

        // 리스트 정렬 1: Collections.sort()
        List<Integer> myList = new ArrayList<>(Arrays.asList(5,3,2,1,5));
        Collections.sort(myList);
        System.out.println(myList);
        Collections.sort(myList, Comparator.reverseOrder());
        System.out.println(myList);

        // 리스트 정렬 2: 객체.sort()
        myList.sort(Comparator.naturalOrder());
        System.out.println(myList);

        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);

        // String배열을 List로 변경
        String[] strArr = {"java", "python", "c++", "javascript"};
        // 1-1: Arrays.asList
        List<String> strList1 = new ArrayList<>(Arrays.asList(strArr));
        System.out.println(strList1);

        // 1-2: for문
        List<String> strList2 = new ArrayList<>();
        for (String index : strArr){
            strList2.add(index);
        }
        System.out.println(strList2);

        // 1-3 streamAPI 참고
        List<String> strList3 = Arrays.stream(strArr).collect(Collectors.toList());

        // 2. int 배열을 list로 변환
        int[] intArr = {10, 20, 30, 40};
        // 1-1. Arrays.asList 사용 불가 (객체 타입이 필요하기 떄문)
        // 1-2. for문 사용 가능
        // 1-3. streamAPI 사용 가능
        List<Integer> intList = Arrays.stream(intArr).boxed().collect(Collectors.toList());

        // 3. String List를 String 배열로 변환
        List<String> strList4 = new ArrayList<>(Arrays.asList("java", "python", "c++"));

        // 3-1: for문
        String[] strArray = new String[strList4.size()];
        for (int i = 0; i < strArray.length; i++){
            strArray[i] = strList4.get(i);
        }
        System.out.println(Arrays.toString(strArray));

        // 3-2: steamAPI 참고
        String[] strArr2 = strList4.toArray(String[]::new);

        // 4. Integer List를 int배열로 변환
        // 4-1) for문으로 변환
        // 4-2) Stream API로 변환

        // 두 개 뽑아서 더하기: 리스트로 구현
    }
}

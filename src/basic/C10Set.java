package basic;

import com.sun.source.tree.Tree;

import java.util.*;

public class C10Set {
    public static void main(String[] args) {
        // 중복과 순서 X
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);

        // 반 학생들이 좋아하는 운동 종목: List로 만들고,
        // 좋아하는 종목명의 개수를 출력
//        List<String> myList = new ArrayList<>();
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("baseball");
//        myList.add("baseball");
//        myList.add("tennis");
//        myList.add("tennis");
//        myList.add("tennis");
//
////        for (String s : myList){
////            mySet.add(s);
////        }
//        // List를 인자값으로 받아 초기값 세팅 가능
//        Set<String> mySet = new HashSet<>(myList);
//        System.out.println(mySet.size());
//
//        // 배열을 인자값으로 받아 set 초기값 세팅
//        String[] myStrArr = {"java", "java", "python", "python", "C++"};
//        Set<String> mySet1 = new HashSet<>(Arrays.asList(myStrArr));
//        Set<String> mySet2 = new HashSet<>(mySet1); // 컬렉션 프레임워크가 들어갈 수 있음
//
//        mySet1.remove("java");
//        System.out.println(mySet1);
//
//        int[] myArrInt = {1,2,3,4,4,3,1};
//        Set<Integer> mySetInt = new HashSet<>();
//        for (int a : myArrInt){
//            mySetInt.add(a);
//        }
//        System.out.println(mySetInt);

//        Set<String> mySet1 = new HashSet<>(Arrays.asList("java", "python", "javascript"));
//        Set<String> mySet2 = new HashSet<>(Arrays.asList("java", "html", "css"));
//
//        // 교집합: retainAll
//        Set<String> temp1 = new HashSet<>(mySet1);
//        temp1.retainAll(mySet2);
//        System.out.println(temp1);
//
//        // 합집합: addAll
//        Set<String> temp2 = new HashSet<>(mySet1);
//        temp2.addAll(mySet2);
//        System.out.println(temp2);
//
//        // 차집합: removeAll
//        Set<String> temp3 = new HashSet<>(mySet1);
//        temp3.removeAll(mySet2);
//        System.out.println(temp3);

        // 프로그래머스 - 전화번호 목록 풀어보기

        // 순서가 없으므로 enhanced for문, iterator 사용

        // LinkedHashSet, TreeSet
//        Set<String> mySet = new TreeSet<>();
//        mySet.add("hello5");
//        mySet.add("hello4");
//        mySet.add("hello3");
//        mySet.add("hello2");
//        mySet.add("hello1");
//        System.out.println(mySet);

        // 두 개 뽑아서 더하기
        int[] numbers = {2,1,3,4,1};
        Set<Integer> numSet = new TreeSet<>();
        for (int i = 0; i< numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                numSet.add(numbers[i] + numbers[j]);
            }
        }
        System.out.println(numSet);
    }
}

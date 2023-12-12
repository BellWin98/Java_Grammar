import java.util.*;

public class C09Map {
    public static void main(String[] args) {
//        Map<String, String> myMap = new HashMap<>();
        // 데이터의 순서 x
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball", "야구");
//        System.out.println(myMap);
//        System.out.println(myMap.get("basketball"));
//
//        // size(), isEmpty() 사용 가능
//        // 이미 key가 있을 경우 put을 하면 덮어쓰기
//        myMap.put("basketball", "탁구");
//
//        // 없으면 put이 putIfAbsent
//        myMap.putIfAbsent("baseball", "배구");
//
//        // key가 없으면 default값 return
//        System.out.println(myMap.getOrDefault("tennis", "스포츠"));
//        System.out.println(myMap.containsKey("tennis"));
//        System.out.println(myMap.containsValue("야구"));
//
//        myMap.remove("baseball");
//        System.out.println(myMap.keySet());
//        System.out.println(myMap.values());
//
//        // enhanced for: key값 하나씩 출력
//        for (String a : myMap.keySet()){
//            System.out.println(myMap.get(a));
//        }

//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball", "야구");
//        // iterator를 통해 key값 하나씩 출력
//        Iterator<String> myIter = myMap.keySet().iterator();
//        // next() 메서드는 데이터를 소모시키면서 return
////        System.out.println(myIter.next());
////        System.out.println(myIter);
//
//        // hasNext(): iterator 안의 값 유무 확인
//        while (myIter.hasNext()){
//            System.out.println(myIter.next());
//        }

        List<String> myList = new ArrayList<>();
        myList.add("basketball");
        myList.add("basketball");
        myList.add("basketball");
        myList.add("baseball");
        myList.add("baseball");
        myList.add("tennis");
        myList.add("tennis");
        myList.add("tennis");

        Map<String, Integer> studentsMap = new HashMap<>();
        for (String s : myList) {
            // 방법 1
            if (!studentsMap.containsKey(s)) {
                studentsMap.put(s, 1);
            } else {
                studentsMap.put(s, studentsMap.get(s) + 1);
            }
            // studentsMap.put(s, studentsMap.getOrDefault(s, 0) + 1); // 방법 2
        }

        for (String info : studentsMap.keySet()){
            System.out.println(info + "을 " + studentsMap.get(info) + "명이 좋아합니다.");
        }
    }
}

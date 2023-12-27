package advanced.c16EtcClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C16Iterator {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");

        // enhanced for문: 원본 변경 X, Remove 불가
        for (String str : myList){
            System.out.println(str);
        }

        // iterator 사용: 참조하고 있는 원본 데이터 삭제 가능 -> remove
        Iterator<String> myIter = myList.iterator();
        while (myIter.hasNext()){
            if (myIter.next().equals("banana")) {
                myIter.remove();
            }
        }
        System.out.println(myList);
    }
}

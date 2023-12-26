package advanced.c16EtcClass;

import java.util.*;

public class C16Generic {
    public static void main(String[] args) {
        String[] stArr = {"java", "python", "C++"};
        // 0번째와 1번째 자리 change
//        String tempStr = stArr[0];
//        stArr[0] = stArr[1];
//        stArr[1] = tempStr;
//        System.out.println("0번째와 1번째 자리 change: " + Arrays.toString(stArr));

        Integer[] intArr = {1,2,3,4,5};
        // 1번째, 2번째 자리 change
//        int tempInt = intArr[1];
//        intArr[1] = intArr[2];
//        intArr[2] = tempInt;
//        System.out.println("1번째와 2번째 자리 change: " + Arrays.toString(intArr));
//        swap(stArr, 0, 1);
//        swap(intArr, 1, 2);

        swap(stArr, 0, 1);
        swap(intArr, 1, 2);
        System.out.println(Arrays.toString(stArr));
        System.out.println(Arrays.toString(intArr));

        GenericStudent<String> genericStrStudent = new GenericStudent<>("han", "26");
        GenericStudent<Integer> genericIntStudent = new GenericStudent<>("jong", 20);
        System.out.println(genericStrStudent.getClass());
        System.out.println(genericIntStudent.getClass());
        System.out.println("이름: " + genericStrStudent.getName() + ", 나이: " + genericStrStudent.getAge());
        System.out.println("이름: " + genericIntStudent.getName() + ", 나이: " + genericIntStudent.getAge());
    }

//    public static void swap(String[] arr, int firstIndex, int secondIndex){
//        String temp = arr[firstIndex];
//        arr[firstIndex] = arr[secondIndex];
//        arr[secondIndex] = temp;
//    }
//    public static void swap(Integer[] arr, int firstIndex, int secondIndex){
//        int temp = arr[firstIndex];
//        arr[firstIndex] = arr[secondIndex];
//        arr[secondIndex] = temp;
//    }

    // 제네릭 메서드 생성: 반환 타입 왼쪽에 <T> 선언
    // 제네릭은 객체 타입이 들어와야 함에 유의
    static <T> void swap (T[] arr, int a, int b){
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

class GenericStudent<T> {
    private final String name;
    private final T age;

    GenericStudent(String name, T age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public T getAge() {
        return age;
    }
}

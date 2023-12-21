package advanced.c15anonymous_lambda;

import java.util.*;

public class C15ComparableComparator {
    public static void main(String[] args) {
        // 자바에서는 비교를 위한 인터페이스가 대표적으로 2개 제공: Comparable, Comparator
        // Comparable 인터페이스에는 compareTo 메서드가 선언됨, 그리고 java의 많은 클래스에서 구현하고 있음 => 일반적으로 클래스 내에서 직접 구현하여 사용하는 방식
        // Comparator 인터페이스에는 compare 메서드가 선언 => 일반적으로 익명객체를 만들어서 활용
        // Comparable과 Comparator의 비교 함수의 차이는 함수명과 매개변수의 개수

        // 두 문자열의 각 문자를 앞에서부터 순차적으로 비교
        // 문자열의 자릿수 차이가 발생할 때, 그 문자의 유니코드 값의 차이를 반환
//        String a = "hello";
//        String b = "horld";
//        System.out.println(a.compareTo(b)); // String이 implement 하고 있는 Comparable의 compareTo 함수 사용
//
        List<String> myList = new ArrayList<>();
//        myList.add(a);
//        myList.add(b);
//        Collections.sort(myList); // Comparable의 compareTo 메서드를 통해 정렬 (String안에 있는 compareTo의 비교 기능을 활용)
//        // 나머지는 Comparator 활용
//        Collections.sort(myList, Comparator.reverseOrder());
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());
//
//        Integer intA = 1;
//        Integer intB = 1;
//        System.out.println(intA.compareTo(intB));
//
        // student 객체 정렬
//        List<Student> studentList = new ArrayList<>();
//        Student st1 = new Student("han", 26);
//        Student st2 = new Student("jong", 30);
//        Student st3 = new Student("seung", 32);
//        Student st4 = new Student("heo", 10);
//        Student st5 = new Student("min", 4);
//        studentList.add(st1);
//        studentList.add(st2);
//        studentList.add(st3);
//        studentList.add(st4);
//        studentList.add(st5);

        // 방법 1: Comparator를 익명 객체 방식으로 활용하여 정렬 (매개변수 2개)
//        studentList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                // 기본은 오름차순 정렬하려고 시도
//                // o2.getAge() - o1.getAge()는 내림차순
//                return o1.getAge() - o2.getAge();
//            }
//        });
        // 오름차순
//        studentList.sort((o1, o2) -> o1.getAge() - o2.getAge()); // 나이로 정렬
//        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName())); // 이름으로 정렬
//
//        // 내림차순
//        studentList.sort((o1, o2) -> o2.getAge() - o1.getAge()); // 나이로 정렬
//        studentList.sort((o1, o2) -> o2.getName().compareTo(o1.getName())); // 이름으로 정렬
//
//        System.out.println(studentList);
//
//        // 글자 길이 수로 정렬
//        String[] strArr = {"hello", "java", "C++", "world2"};
//        Arrays.sort(strArr, ((o1, o2) -> o1.length() - o2.length())); // 오름차순
//        Arrays.sort(strArr, (o1, o2) -> o2.length() - o1.length()); // 내림차순
//
//        System.out.println(Arrays.toString(strArr));
//
//        // Priority Queue 내림차순 (기본: 오름차순)
//        Queue<String> myQue1 = new PriorityQueue<>((o1, o2) -> o1.compareTo(o2));
//
//        // 길이 정렬
//        Queue<String> myQue2 = new PriorityQueue<>((o1, o2) -> o1.length() - o2.length());
//        Queue<String> myQue3 = new PriorityQueue<>((o1, o2) -> o1.length() - o2.length());

        // 프로그래머스 - 가장 큰 수

        // 방법 2: Comparable 인터페이스 implements 후 compareTo 메서드 구현 (매개변수 1개)
//        Collections.sort(studentList);
//        System.out.println(studentList);

        // 쓰레드 구현 방식: 쓰레드 상속, Runnable 방식
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("새로 만든 쓰레드 입니다.");
            }
        });
        t1.start();

        // 쓰레드 람다 표현식
        new Thread(() -> System.out.println("새로 만든 쓰레드 입니다.")).start();
        System.out.println("main의 쓰레드 입니다.");
    }
}

class Student implements Comparable<Student>{
    private final String name;
    private final int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 조상 클래스인 Object 클래스의 toString()을 오버라이딩하여 객체 호출 시 자동으로 toString() 호출
    @Override
    public String toString(){
        return "이름: " + this.name + ", 나이: " + this.age + "\n";
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}

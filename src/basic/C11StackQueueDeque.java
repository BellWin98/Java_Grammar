package basic;

import java.util.*;

public class C11StackQueueDeque {
    public static void main(String[] args) {
//        Stack<Integer> myStack = new Stack<>(); // 스택은 구현체 (클래스임)
//        myStack.push(10);
//        myStack.push(20);
//        myStack.push(30);
//
//        // pop: 스택에서 요소 제거 후 해당 요소 반환
//        System.out.println(myStack.pop());
//
//        // peek: 스택에서 마지막 요소 반환. 제거 X (엿보기)
//        System.out.println(myStack.peek());
//        System.out.println(myStack);
//
//        // String 객체 5개 stack에 추가 후 while문 통해 모두 출력
//        Stack<String> strStack = new Stack<>();
//        strStack.push("basketball");
//        strStack.push("baseball");
//        strStack.push("volleyball");
//        strStack.push("pocketball");
//        strStack.push("football");
//
//        while (!strStack.isEmpty()){
//            System.out.println(strStack.pop());
//        }
//
//        // 웹페이지 방문
//        // 방문한 사이트 출력 + 뒤로가기 기능 구현
//        // 스캐너로 신규사이트 방문 or 뒤로가기
//        // 신규 사이트 방문일 경우, 해당 주소 push
//        // 뒤로 가기의 경우, 해당 주소 pop
//        Stack<String> backwards = new Stack<>();
//        Stack<String> forwards = new Stack<>();
//        Scanner sc = new Scanner(System.in);
//        while (true){
//            System.out.print("신규 사이트에 방문하시려면 1, 뒤로가기를 하시려면 2, 앞으로 가기를 하시려면 3, 종료하려면 4를 입력하세요: ");
//            int choose = sc.nextInt();
//            if (choose == 1){
//                System.out.print("사이트 주소를 입력해주세요: ");
//                String site = sc.next();
//                System.out.println("방문하신 사이트는: " + site + "입니다.");
//                backwards.push(site);
//            } else if (choose == 2){
//                if (backwards.isEmpty()){
//                    System.out.println("최근 방문한 사이트가 없습니다.");
//                } else {
//                    String temp = backwards.pop();
//                    forwards.push(temp);
//                    System.out.println("뒤로가기 한 사이트: " + backwards.peek());
//                }
//            } else if (choose == 3){
//                String temp = forwards.pop();
//                backwards.push(temp);
//                System.out.println("앞으로 가기 한 사이트: " + temp);
//            } else if (choose == 4){
//                break;
//            }
//        }
//
//        Queue<Integer> myQueue = new LinkedList<>();
//        myQueue.add(10);
//        myQueue.add(20);
//        myQueue.add(30);
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue);
//
//        // 프린터 대기열 예제
//        // 문서1추가, 문서2추가, 문서3추가
//        // while문을 통해 "현재 인쇄 중인 문서: 문서1"
//        Queue<String> printerQueue = new LinkedList<>();
//        printerQueue.add("문서1");
//        printerQueue.add("문서2");
//        printerQueue.add("문서3");
//
//        while (!printerQueue.isEmpty()) {
//            System.out.println("현재 인쇄 중인 문서: " + printerQueue.poll());
//        }
//
//        // 길이의 제한이 있는 큐: ArrayBlockingQueue
//        Queue<String> blockQueue = new ArrayBlockingQueue<>(3);
//        blockQueue.offer("hello1");
//        blockQueue.offer("hello2");
//        blockQueue.offer("hello3");
//        blockQueue.offer("hello4");
//        System.out.println(blockQueue);
//
//        // add와 offer의 차이: add는 길이가 다 찼을 때 에러를 발생. offer는 공간이 충분할 때만 add
//
//        // 우선순위 큐
//        // 힙 자료구조가 구현되어있음
//        // 데이터 삽입 / 삭제 시에 자동으로 Heapify가 일어난다.
//        // 힙 자료구조는 부모 노드가 자식 노드보다 크거나 작아야 함.
//        // 힙 자료구조가 구현되어 있다고 해서 전체가 정렬되진 않는다.
//        // poll 한번 할 때마다 log n의 복잡도를 가짐
//        // 전체 데이터를 꺼냈을 때의 시간복잡도: n * log n
//        Queue<Integer> pq = new PriorityQueue<>(); // 우선 순위 큐는 최소 힙 구조를 유지함
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);
//        while (!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }

        // 프로그래머스: 더 맵게 (List 사용해서 풀어보기)

        // ArrayDeque: 양방향에서 데이터를 삽입 / 제거할 수 있다.
        // 성능 빠름 (이유는 찾아보기)
        Deque<Integer> myDeque = new ArrayDeque<>();
        myDeque.addFirst(10);
        myDeque.addFirst(20);
        myDeque.addLast(30);
        System.out.println(myDeque);
        System.out.println(myDeque.pollFirst());
        System.out.println(myDeque.pollLast());
        System.out.println(myDeque.poll());

        // 프로그래머스 - 올바른 괄호 (풀어보기)
        // for, stack, deque로 풀어보기


    }
}

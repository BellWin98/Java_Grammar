package advanced.class_method_recur;

public class C12Method {
    public static void main(String[] args) {

        // for문 이용해서 1~10까지 total 값 출력
        System.out.println(sumAcc(1, 10));

        // 코드의 중복을 피하기 위해 특정 기능 집합을 별도로 분리
        // 같은 클래스 내의 메서드들 사이에서의 호출은 static 메서드라 할지라도 클래스명 생략가능
        // static이 붙어있는 메서드는 클래스 메서드라서 클래스로 접근해야함. (클래스 메서드)
        // static이 안붙어있으면, 객체 생성해서 접근해야함. (객체 메서드)
        // 클래스 변수와 객체는 저장되는 메모리 영역이 다르다.
        // 클래스 메서드를 남발하면 안된다. 자바에서 가비지 컬렉팅이 안됨.
    }

    public static int sumAcc(int start, int end){
        int total = 0;
        for (int i = start; i <= end; i++){
            total += i;
        }
        return total;
    }
}

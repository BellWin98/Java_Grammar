package advanced.c12class_method_recur;

public class C12Class {
    public static void main(String[] args) {
        // 클래스 변수를 공용으로 사용하다보니, 변수와 메서드에 고유성이 보장되지 않음
        System.out.println(MyCalculator.sum(10,20));
        MyCalculator.sumAcc(10);
        MyCalculator.sumAcc(20);
        int total = MyCalculator.total;
        System.out.println(total);

        // A부서의 매출
        MyCalInstance myCalA = new MyCalInstance();
        myCalA.sumAcc(10);
        myCalA.sumAcc(20);
        myCalA.sumAcc(30);
        System.out.println(myCalA.total);

        // B부서의 매출
        MyCalInstance myCalB = new MyCalInstance();
        myCalB.sumAcc(10);
        myCalB.sumAcc(20);
        myCalB.sumAcc(30);
        System.out.println(myCalB.total);
    }
}

class MyCalculator{
    static int total = 0;

    static int sum(int a, int b){
        return a + b;
    }

    static void sumAcc(int a){
        total += a;
    }
}

class MyCalInstance {

    // static이 붙어있는 변수는 클래스 변수, static이 붙어있지 않으면 객체 변수
    int total = 0;
    // 매개변수 2개 더하는 함수: sum
    int sum(int a, int b){
        return a + b;
    }

    void sumAcc(int total){
        this.total += total;
    }
}

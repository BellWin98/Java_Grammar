package advanced.c15anonymous_lambda;

public class C15InnerClass {
    public static void main(String[] args) {
        MemberInnerClass.StaticInnerClass s1 = new MemberInnerClass.StaticInnerClass();
        s1.display();
        MemberInnerClass mi = new MemberInnerClass();
        mi.display();
    }
}

// 일반 내부 클래스
class MemberInnerClass{

    private int a;
    void display(){
        System.out.println("a의 값은: " +  a);
    }
    // static 내부 클래스
    // 이 클래스는 정적 멤버(변수, 메서드)처럼 활용된다.
    static class StaticInnerClass{
        private int data;
        void display(){
            System.out.println("data 값은: " + data + "입니다.");
        }
    }
}

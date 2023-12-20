package advanced.c14interface;

public class StaticFinalInterface {
    public static void main(String[] args) {
        MyImplements mi = new MyImplements();
        mi.methodA();
        System.out.println(mi.myConstant);
    }
}

interface MyInterface{
    // 아래 변수는 컴파일 타임에 static final이 붙는다! --> 상수이자, 클래스 변수
    int myConstant = 100;
    void methodA();
}

class MyImplements implements MyInterface{

    @Override
    public void methodA() {
        System.out.println("hello");
    }
}

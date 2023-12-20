package advanced.inheritance_test;

import advanced.inheritance.C13ProtectedClass;

public class ProtectedMain extends C13ProtectedClass{
    public static void main(String[] args) {
//        C13ProtectedClass pt = new C13ProtectedClass();
//        System.out.println(pt.st3);
//        System.out.println(pt.st4);

        // 상속한 객체에서 protected 변수 접근 가능
        // 자식 클래스의 객체를 만들어주어야 부모 클래스의 protected 변수에 접근 가능
        ProtectedMain pm = new ProtectedMain();
        System.out.println(pm.st3);
        System.out.println(pm.st4);
    }
}

package advanced.c13inheritance;

public class C13ProtectedTest {
    public static void main(String[] args) {
        C13ProtectedClass pc = new C13ProtectedClass();
        // default 접근 가능
        System.out.println(pc.st2);

        // protected 접근 가능
        System.out.println(pc.st3);

        // public 접근 가능
        System.out.println(pc.st4);

    }
}

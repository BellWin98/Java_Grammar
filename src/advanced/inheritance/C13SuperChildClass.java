package advanced.inheritance;

// super(): 부모 클래스의 생성자를 의미, super 키워드: 부모 클래스를 의미
public class C13SuperChildClass extends SuperParents {
    int b;
    int a;
    C13SuperChildClass(){
        super(100);
        a = 30;
        b = 20;
    }
    void display(){
        System.out.println(a);
        System.out.println(super.a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        C13SuperChildClass scc = new C13SuperChildClass();
        scc.display();
    }
}

class SuperParents{
    int a;
    SuperParents(int a){
        this.a = a;
    }
}

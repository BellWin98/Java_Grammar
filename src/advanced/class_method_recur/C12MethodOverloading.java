package advanced.class_method_recur;

import java.util.ArrayList;
import java.util.List;

public class C12MethodOverloading {
    public static void main(String[] args) {
        C12MethodOverloading cmo = new C12MethodOverloading();

        // 메서드 오버로딩을 통해 같은 메서드명 재활용
        System.out.println(cmo.sum(1, 2));
        System.out.println(cmo.sum(1, 2, 3));
        System.out.println(cmo.sum(3.14, 5.43));

        // 제네릭을 통해 타입 재활용
        // 제네릭: 어떤 타입이든 들어올 수 있음 <E>, <T>
        // 타입을 지정하면 유연성이 떨어지게 됨.
        List<Integer> myList = new ArrayList<>();
    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double sum(double num1, double num2){
        return num1 + num2;
    }
}

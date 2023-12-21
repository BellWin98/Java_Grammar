package advanced.c15anonymous_lambda;

public class C15LambdaExpression {
    public static void main(String[] args) {
//        LambdaInterface li = (a, b) -> System.out.println(a+b);
//        li.makeString("hello", "world");
        // 매개변수를 순서로 인지하므로, 타입을 지정해 줄 필요는 없다.
        LambdaInterface mi = (a, b, c) -> {
            String answer = a + b;
            return answer;
        };
        System.out.println(mi.makeString("hello", "java", 3));
    }
}

interface LambdaInterface{
    String makeString(String a, String b, int c);
}

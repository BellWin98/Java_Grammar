package basic;

import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args) {
//        int a = 20;
//        String my_string = "hello world";
//        System.out.println("a = " + a);
//        System.out.println(my_string + a);
//        숫자와 숫자를 더하면 더하기 연산한다.

        // 입력: System.in(키보드 입력) + Scanner (입력을 위한 클래스)
//        System.out.println("더하기를 할 숫자 2개를 입력해주세요");
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println("입력하신 두 수를 더한 값은 " + (a + b) + "입니다.");
        double input_double = sc.nextDouble();
        boolean input_boolean = sc.nextBoolean();
        System.out.println(input_double +", "+ input_boolean);
//        System.out.println("아무 문자열이나 입력해주세요");
//        // nextLine은 입력 받은 데이터를 한 줄 읽어서 String으로 리턴
//        String input = sc.nextLine();
//        System.out.println("사용자가 입력한 문자열: " + input);
//        // nextInt는 입력 받은 데이터를 한 줄 읽어서 int로 리턴
//        System.out.println("아무 숫자나 입력해주세요");
//        int inputInt = sc.nextInt();
//        System.out.println("사용자가 입력한 숫자: " + inputInt);

        // 입출력 시스템 메모리 해제
        sc.close();
    }
}

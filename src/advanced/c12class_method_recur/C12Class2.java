package advanced.c12class_method_recur;

import java.util.Scanner;

public class C12Class2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();

        while (true){
            System.out.println("계속 진행하시려면 1번, 종료하시려면 0번을 눌러주세요");
            int exit = sc.nextInt();
            if (exit == 0) {
                break;
            }
            System.out.println("이름을 10글자 이하로 입력해주세요.");
            person.setName(sc.next());

            System.out.println("이메일을 @포함하여 입력해주세요.");
            person.setEmail(sc.next());

            System.out.println("20세 이상의 나이만 입력해주세요");
            person.setAge(sc.nextInt());

            System.out.println("이름: " + person.getName());
            System.out.println("이메일: " + person.getEmail());
            System.out.println("나이: " + person.getAge());
        }
    }
}

class Person {
    private String name;
    private String email;
    private String password;
    private int age;
    static int total = 0;

    public void setName(String name) {
        if (name.length() > 10){
            System.out.println("이름이 10글자를 초과하였습니다.");
            return;
        }
        this.name = name;
    }

    public void setEmail(String email) {
        if (!email.contains("@")){
            System.out.println("@이 포함되어 있지 않습니다.");
            return;
        }
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        if (age < 20){
            System.out.println("20세 미만은 입력할 수 없습니다.");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
}

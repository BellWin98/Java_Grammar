package advanced.c17ExceptionFileParsing.author_exception;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;

public class AuthorController {
    public static void main(String[] args) {
        // 메모리 DB에 데이터 추가 / 삭제 부분은 Repository로 분리
        AuthorService authorService = new AuthorService();
        loop1:
        while (true){
            System.out.println("어떤 서비스를 이용하시겠습니까? 숫자만 입력해주세요");
            System.out.println("0: 종료, 1: 회원가입, 2: 로그인");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            switch (number){
                case 0:
                    System.out.println("프로그램이 종료됩니다.");
                    break loop1;
                case 1:
                    System.out.print("가입할 이메일을 입력하세요: ");
                    String email = sc.next();
                    System.out.print("가입할 비밀번호를 입력하세요: ");
                    String password = sc.next();
                    System.out.print("가입할 닉네임을 입력하세요: ");
                    String nickname = sc.next();
                    Author author = new Author(email, password, nickname);
                    try {
                        authorService.register(author);
                    } catch (IllegalArgumentException e){
                        System.out.println("회원가입에 실패하였습니다.");
                        System.out.println("오류 내용: " + e.getMessage());
                    } catch (Exception e){
                        System.out.println("회원가입에 실패하였습니다.");
                        System.out.println("알 수 없는 에러입니다.");
                    }
                    break;
                case 2:
                    System.out.print("이메일을 입력하세요: ");
                    String userEmail = sc.next();
                    System.out.print("비밀번호를 입력하세요: ");
                    String userPassword = sc.next();
                    try {
                        Author loginedAuthor = authorService.login(userEmail, userPassword);
                        System.out.println(loginedAuthor.getNickname() + "님 환영합니다.");
                    } catch (IllegalArgumentException | NoSuchElementException e){
                        System.out.println("로그인에 실패하였습니다.");
                        System.out.println("오류 내용: " + e.getMessage());
                    } catch (Exception e){
                        System.out.println("로그인에 실패하였습니다.");
                        System.out.println("알 수 없는 오류입니다.");
                    }
                    break;
            }
        }
    }
}

package structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;


/**
 * [기능 구현 목록]
 * 1. 회원가입
 * 2. 게시글 작성
 * 3. 회원 목록 조회: 회원 email 출력
 * 4. 회원 상세 조회: 아이디로 찾기, 회원명, 회원 email, 회원 작성 게시글 수
 * 5. 게시글 상세 조회: 제목, 작성자 email
 */
public class AuthorPostService {

    static List<Author> authors = new ArrayList<>();
    static List<Post> posts = new ArrayList<>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Author author = null;
        loop1:
        while (true){
            System.out.println("어떤 서비스를 이용하시겠습니까? 숫자만 입력해주세요");
            System.out.println("0: 종료, 1: 회원가입, 2: 게시글 작성, 3: 회원목록조회, 4: 회원상세조회, 5: 게시글 상세조회");
            int number = sc.nextInt();
            switch (number){
                case 0:
                    System.out.println("프로그램이 종료됩니다.");
                    break loop1;
                case 1:
                    signUp();
                    break;
                case 2:
                    System.out.println("게시글 작성을 하기 위해서는 로그인이 필요합니다. 로그인 하시겠습니까?");
                    System.out.println("1: 예, 2: 아니오");
                    int yn = sc.nextInt();
                    if (yn == 1){
                        System.out.print("이메일을 입력하세요: ");
                        String email = sc.next();
                        System.out.print("비밀번호를 입력하세요: ");
                        String password = sc.next();
                        if (login(email, password) == null){
                            break;
                        } else {
                            author = login(email, password);
                            System.out.println("로그인에 성공하였습니다.");
                            writePost(author);
                            break;
                        }
                    } else if (yn == 2){
                        break;
                    } else {
                        System.out.println("잘못된 입력값입니다.");
                        continue;
                    }
                case 3:
                    for (Author a : authors){
                        System.out.println(a.getEmail());
                    }
                    break;
                case 4:
                    if (author == null) {
                        System.out.println("로그인이 필요합니다.");
                        break;
                    }
                    getAuthorDetails(author);
                    break;

                case 5:
                    System.out.print("게시글 고유 번호를 입력해주세요: ");
                    Long postId = sc.nextLong();
                    getPostDetails(postId);
                    break;
            }
        }
    }

    public static void signUp(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("이메일을 입력해주세요: ");
            String email = sc.next();
            boolean isExist = false;
            for (Author author : authors){
                if (author.getEmail().equals(email)){
                    System.out.println("이미 가입된 이메일입니다.");
                    isExist = true;
                    break;
                }
            }
            if (isExist){
                continue;
            }
            if (!Pattern.matches("^[a-z0-9]+@[a-z]+.com$", email)){
                System.out.println("이메일 형식이 맞지 않습니다.");
            } else {

                System.out.print("비밀번호를 입력해주세요: ");
                String password = sc.next();

                System.out.print("이름을 입력해주세요: ");
                String name = sc.next();

                Author author = new Author(name, email, password);
                authors.add(author);
                System.out.println("정상적으로 회원가입 되었습니다.");
                System.out.println("가입된 회원 고유번호: " + author.getId());
                break;
            }
        }
    }

    public static Author login(String email, String password){
        for (Author author : authors){
            if (author.getEmail().equals(email)){
                if (author.getPassword().equals(password)){
                    return author;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                    return null;
                }
            }
        }
        System.out.println("해당 이메일로 가입된 회원이 없습니다.");
        return null;
    }

    public static void writePost(Author author){
        Scanner sc = new Scanner(System.in);
        System.out.print("게시글 제목을 입력하세요: ");
        String title = sc.nextLine();
        System.out.print("게시글 내용을 입력하세요: ");
        String contents = sc.nextLine();

        Post post = new Post(title, contents, author);
        posts.add(post);
        System.out.println("게시글이 정상적으로 작성되었습니다. 게시글 고유번호: " + post.getId());
        System.out.println("게시글 제목: " + post.getTitle() + ", 게시글 내용: " + post.getContents());
    }

    public static void getAuthorDetails(Author author){
        System.out.println("회원명: " + author.getName() + "\n" + "회원 email: " + author.getEmail());
        System.out.println("회원 작성 게시글 수: " + author.getPosts().size());
    }

    public static void getPostDetails(Long id){
        for (Post post : posts){
            if (post.getId() == id){
                System.out.println("게시글 제목: " + post.getTitle());
                System.out.println("작성자 email: " + post.getAuthor().getEmail());
                break;
            }
        }
    }
}

// 엔티티
class Author{
    private final Long id;
    private final String name;
    private final String email;
    private final String password;

    private final List<Post> posts;

    static Long static_id = 0L;

    Author(String name, String email, String password){
        static_id += 1;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.posts = new ArrayList<>();
    }

    public Long getId() {
        return id;
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

    public List<Post> getPosts(){
        return posts;
    }

    public void addPost(Post post){
        posts.add(post);
    }
}

class Post{
    private final Long id;
    private final String title;
    private final String contents;
    private final Author author;
    static Long static_id = 0L;

    Post(String title, String contents, Author author){
        static_id += 1;
        this.id = static_id;
        this.title = title;
        this.contents = contents;
        this.author = author;
        this.author.addPost(this); // 메모리 주소 공유
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public Author getAuthor(){
        return author;
    }
}

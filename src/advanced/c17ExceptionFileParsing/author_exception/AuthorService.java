package advanced.c17ExceptionFileParsing.author_exception;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.regex.Pattern;

public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(){
        authorRepository = new AuthorRepository();
    }

    public void register(Author author) throws IllegalArgumentException{
        // 이미 가입된 이메일 존재하면 예외 처리
        Optional<Author> findEmail = authorRepository.findByEmail(author.getEmail());
        if (findEmail.isPresent()){
            throw new IllegalArgumentException("이미 가입된 이메일입니다.");
        }
        if (!Pattern.matches("^[a-z0-9]+@[a-z]+.com$", author.getEmail())){
            System.out.println("이메일 형식이 맞지 않습니다.");
            System.out.println("회원가입에 실패하였습니다.");
            return;
        }
        // 만약 password가 5자리 이하이면 예외 발생(IllegalArgumentException)
        if (author.getPassword().length() <= 5){
            throw new IllegalArgumentException("비밀번호는 6자리 이상이어야 합니다.");
        }
        authorRepository.save(author);
        System.out.println("정상적으로 회원가입 되었습니다.");
        System.out.println("가입된 회원 이메일: " + author.getEmail());
    }

    public Optional<Author> login(String email, String password) throws IllegalArgumentException, NoSuchElementException{
        // email이 존재하지 않으면 예외 발생 (NoSuchElementException)
        Optional<Author> findAuthor = authorRepository.findByEmail(email);
        if (findAuthor.isEmpty()){
            throw new NoSuchElementException("존재하지 않는 이메일입니다.");
        }
        // password가 불일치하면 예외 발생 (IllegalArgumentException)
        if (!findAuthor.get().getPassword().equals(password)){
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }
        System.out.println("성공적으로 로그인 되었습니다.");
        return findAuthor;
    }
}

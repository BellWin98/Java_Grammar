package advanced.c17ExceptionFileParsing.author_exception;
public class Author{
    private final Long id;
    private final String email;
    private final String password;

    private final String nickname;
    static Long static_id = 0L;

    Author(String email, String password, String nickname){
        static_id += 1;
        this.id = static_id;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }
}

package advanced.c17ExceptionFileParsing.author_exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AuthorRepository {

    private final List<Author> authors;

    AuthorRepository(){
        authors = new ArrayList<>();
    }
    public void save(Author author){
        authors.add(author);
    }

    public List<Author> getAuthors(){
        return authors;
    }

    public Optional<Author> findByEmail(String email){
        for (Author author : authors){
            if (author.getEmail().equals(email)){
                return Optional.of(author);
            }
        }
        return Optional.empty();
    }
}

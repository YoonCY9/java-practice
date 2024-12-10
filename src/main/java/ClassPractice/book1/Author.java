package ClassPractice.book1;

import java.util.ArrayList;
import java.util.List;

public class Author {

    private String name;
    private String dateOfBirth;
    private List<Book> books = new ArrayList<>();

    public Author(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    void changeName(String newName) {
        if (newName.length() > 10) {
            throw new RuntimeException("너무 길어");
        }
        name = newName;
    }

}
